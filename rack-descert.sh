# Fail the whole script if any command fails
set -e

# Get directories of interest
DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PARENT_DIR="$(dirname "$DIR")"

DEBUG=true

help_usage(){
  echo "Usage: ./rack-descert.sh <cli|init|ingest> OPTIONS"
  echo ""
  echo " OPTIONS"
  echo "--conda=CONDA_NAME"
  echo "--condaenv=CONDA_ENV_NAME"
  echo ""
}


setup_rack_cli(){
  pushd ${DIR} &>/dev/null
  mkdir -p .rib.d

	# Activates conda shell
	# (thx to https://castorfou.github.io/guillaume_blog/blog/conda-activate-from-bash-script.html)
	source build/bootstrap/${CONDA}/etc/profile.d/conda.sh
	conda activate build/envs/${CONDA_ENV}

  pushd .rib.d &>/dev/null

  # Gets a fresh copy of RiB
  if [ -d RACK ]; then
    rm -rf RACK
  fi

  # Clones RACK repository
  git clone https://github.com/ge-high-assurance/RACK.git

  # Setups RACK-cli
  pushd RACK/cli &>/dev/null
  echo "We are at: $PWD"

  echo "Installing dependencies and then RACK-cli"
  python -m pip install --force -r requirements.txt
  python setup.py install
  # Deactivates Conda; required work has been done
  conda deactivate

  # Returns to descert-example directory
  popd &>/dev/null # Exit RACK/cli
  popd &>/dev/null # Exit .rib.d
  popd &>/dev/null # Exit project's dir

}

setup_arcos_rack(){
  pushd ${DIR} &>/dev/null

	source build/bootstrap/${CONDA}/etc/profile.d/conda.sh
	conda activate build/envs/${CONDA_ENV}


  if [ ! -d .rib.d ]; then
    echo "no RACK installation found. Did you run setup_rack_cli?"
    exit 1
  fi

  pushd .rib.d/RACK/cli &>/dev/null
    echo "We are at: $PWD"
    echo "Setting up RACK-ARCOS"
	  ./setup-arcos.sh

  popd &>/dev/null # Exit ${DIR}/.rib.d/RACK/cli
  
  python evidence/dataprep.py
  conda deactivate

  popd &>/dev/null # Exit project's dir

}


import_data(){
	pushd ${DIR} &>/dev/null
	source build/bootstrap/${CONDA}/etc/profile.d/conda.sh
	conda activate build/envs/${CONDA_ENV}

	# python evidence/dataprep.py
	# ./ingestpack/DesCert-DataIngestion.sh


	conda deactivate
	popd &>/dev/null # Exit project's dir
}

# This is the main entry point, which calls one of the above three procedures.
case $1 in
  cli)
	shift
	for i in "$@"
	do
    case $i in
      --condaenv=*)
      CONDA_ENV="${i#*=}"
      ;;
      --conda=*)
      CONDA="${i#*=}"
      ;;
      *)
      echo "Error: Unrecognized data option."
      exit 1
      ;;
    esac
    done
	echo "Setup rack-cli"
    if [[ -z ${CONDA+x} ]] ; then
      echo "Error: CONDA is unset; e.g., '--conda=CONDA_NAME'"
      exit 1
  	fi
    if [[ -z ${CONDA_ENV+x} ]] ; then
      echo "Error: CONDA_ENV is unset; e.g., '--condaenv=CONDA_ENV'"
      exit 1
    fi
	setup_rack_cli
	;;
  init)
	shift
	for i in "$@"
	do
    case $i in
      --condaenv=*)
      CONDA_ENV="${i#*=}"
      ;;
      --conda=*)
      CONDA="${i#*=}"
      ;;
      *)
      echo "Error: Unrecognized init option."
      exit 1
      ;;
    esac
    done
	  echo "Init Rack-Arcos"
    if [[ -z ${CONDA+x} ]] ; then
      echo "Error: CONDA is unset; e.g., '--conda=CONDA_NAME'"
      exit 1
  	fi
    if [[ -z ${CONDA_ENV+x} ]] ; then
      echo "Error: CONDA_ENV is unset; e.g., '--condaenv=CONDA_ENV'"
      exit 1
    fi
	  setup_arcos_rack
	  ;;
  import)
	shift
	for i in "$@"
	do
    case $i in
      --condaenv=*)
      CONDA_ENV="${i#*=}"
      ;;
      --conda=*)
      CONDA="${i#*=}"
      ;;
      *)
      echo "Error: Unrecognized data option."
      exit 1
      ;;
    esac
    done
	  echo "Update Arcos.DesCert data model"	
    if [[ -z ${CONDA+x} ]] ; then
      echo "Error: CONDA is unset; e.g., '--conda=CONDA_NAME'"
      exit 1
  	fi
    if [[ -z ${CONDA_ENV+x} ]] ; then
      echo "Error: CONDA_ENV is unset; e.g., '--condaenv=CONDA_ENV'"
      exit 1
    fi
    import_data
    ;;
  *)
    echo "Error: Unrecognized command."
    help_usage
    exit 1
    ;;
esac
