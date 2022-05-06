#!/usr/bin/env bash

# Fail the whole script if any command fails
set -e

DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

pushd ${DIR} &>/dev/null

if [ -d .dst.d ]; then
	echo Deleting dot descert dir 
	rm -rf .dst.d
fi

# Downloads resources needed by the project
mkdir -p .dst.d
pushd .dst.d &>/dev/null

# 1. Download the corpus.json, which specifies which GitHub
# repositories to download (No need to go inside this directory)

if [ -d data ]; then
	rm -rf data
fi
# clones the corpus.json needed by dnd-cli's commands
git clone https://gist.github.com/999912a59e25095929ab103e3da851dd.git data


# 2. Download the needed tool jars for this project

# Libs (dependencies)

if [ -d libs ]; then
	rm -rf libs
fi

mkdir -p libs
pushd libs &>/dev/null

JARS=(
	"https://github.com/randoop/randoop/releases/download/v4.2.6/replacecall-4.2.6.jar"
  "https://github.com/randoop/randoop/releases/download/v4.2.6/randoop-all-4.2.6.jar"
  "https://github.com/junit-team/junit/releases/download/r4.12/junit-4.12.jar"
  "http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar"
)

# Fetch JARS
for jar in "${JARS[@]}"; do
	base=$(basename ${jar})
	echo Fetching ${base}

	if curl -fLo ${base} ${jar} &> /dev/null; then
		:
	else
		echo Fetching ${base} failed.
		exit 1;
	fi
done

for jar in "${JARS[@]}"; do
	base=$(basename ${jar})
	echo Renaming ${base}

	if [[ ${base} = "randoop-all"* ]]; then
	# if grep -q "randoop-all" "$base"; then
		echo Renaming ${base}
		mv ${base} "randoop.jar"
	# elif grep -q "replacecall" "$base"; then
	elif [[ ${base} = "replacecall-"* ]]; then
		mv ${base} "replacecall.jar"
	fi
done

# extract the default replacements file
jar -xf replacecall.jar default-replacements.txt

popd &>/dev/null # Exit libs

# 3. Install do-like-javac

mkdir -p tools
pushd tools &>/dev/null

# Fetch do-like-javac if not using external
if [[ -z "${DLJCDIR}" ]]; then
	if [ -d do-like-javac ]; then
		rm -rf do-like-javac
	fi
	git clone https://github.com/SRI-CSL/do-like-javac.git
	# The descert-evidence-data contains an additional
	# tool called `csve`, which turns Randoop and Daikon
	# evidence data (in JSON format) into a set of csv
	# files matching Honeywell's ontology
	pushd do-like-javac &>/dev/null
	git checkout descert-evidence-data
	popd &>/dev/null # Exit do-like-javac
fi


# Fetch Daikon
if [[ -z "${DAIKONDIR}" ]]; then
	DAIKONBASEURL="http://plse.cs.washington.edu/daikon"
	DAIKONVERSION=`curl --fail -s $DAIKONBASEURL/download/doc/VERSION | xargs echo -n`
	DAIKON_SRC=$DAIKONBASEURL/download/daikon-$DAIKONVERSION.tar.gz
	DAIKON_SRC_FILE=$(basename ${DAIKON_SRC})

	if [ ! -e $DAIKON_SRC_FILE ]; then
		if [ -d daikon-src ]; then
			rm -rf daikon-src
		fi

		if curl -fLo $DAIKON_SRC_FILE $DAIKON_SRC; then
			echo JAVA_HOME: ${JAVA_HOME:?"Building Daikon requires the JAVA_HOME environment variable to be set."}
			DAIKON_TARBALL=`pwd`/$DAIKON_SRC_FILE
			DAIKON_SRC_DIR=`tar -tzf ${DAIKON_TARBALL} | head -1 | cut -f1 -d"/"`
			tar xzf $DAIKON_TARBALL
			mv $DAIKON_SRC_DIR daikon-src
			pushd daikon-src &>/dev/null
				make dyncomp-jdk
			popd &>/dev/null # exit daikon-src
			cp daikon-src/daikon.jar ../libs/daikon.jar
			cp daikon-src/java/ChicoryPremain.jar ../libs/ChicoryPremain.jar
			cp daikon-src/java/dcomp_premain.jar ../libs/dcomp_premain.jar
			cp daikon-src/java/dcomp_rt.jar ../libs/dcomp_rt.jar
		else
			echo "Fetching $DAIKON_SRC failed."
			exit 1;
		fi
	else
		echo "Daikon already up to date."
	fi
fi

popd &>/dev/null # Exit tools

popd &>/dev/null # Exit .dst.d

popd &>/dev/null # Exit project's dir