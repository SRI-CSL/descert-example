#!/bin/sh
# Copyright (c) 2020, General Electric Company and Galois, Inc.
set -eu
BASEDIR=$(dirname "$0")
echo "$BASEDIR"
if ! command -v rack > /dev/null
then
    cat <<-END
        ERROR: rack cli tool not found in PATH

        Installation instructions are available at
        https://github.com/ge-high-assurance/RACK/wiki/RACK-CLI#install-dependencies
        or locally in README.md

        If you've already installed RACK CLI, please activate your virtual environment

        macOS/Linux: source venv/bin/activate
        Windows:     venv\\Scripts\\activate.bat
        PowerShell:  venv\\Scripts\\Activate.ps1
    END
    exit 1
fi

# Import Randoop and Daikon data (only if present)
echo "${BASEDIR}"
if [ -d ${BASEDIR}/Randoop_Daikon ]; then
rack data import --clear $BASEDIR/Randoop_Daikon/import.yaml
fi

echo "Finished data importing"