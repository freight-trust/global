@ECHO OFF

::
:: Control Varialbes
::  
set FLO_DO_WEB=1
set FLO_DO_ZIP=1
set FLO_DO_ZIP_CLEANUP=1
set FLO_DO_PAUSE=0

::
:: Revision Varialbes
::
set FLO_REVIS_LOCAL=0
set FLO_REVIS_REPOS=0

::
:: Subversion Variables
::
::   FLO_SLIKSVN_PATH - Path to the SLIKSVN executable
::
::   FLO_REPO_HELP_ROOT_PATH - Root for the help files in the SVN Repository, for getting the .chm files
::   FLO_REPO_HELP_WEB_PATH  - Directory in the SVN Repository that stores the actual website code, for getting website source files
::
::   FLO_USERNAME - The username that has read access to ROOT_PATH and WEB_PATH above
::   FLO_PASSWORD - The password for the FLO_USERNAME user
::
set FLO_SLIKSVN_PATH="C:\Program Files\SlikSvn\bin\svn.exe"
set FLO_REPO_HELP_ROOT_PATH=https://svn.flow.net.nz:8883/svn/_repo/flow/branch/230/install/help
set FLO_REPO_HELP_WEB_PATH=https://svn.flow.net.nz:8883/svn/_repo/flow/branch/230/install/help/WebHelp
set FLO_USERNAME=AutoDocumenter
set FLO_PASSWORD=F1oDocu

::
:: Local Filesystem Variables
::
::   FLO_DOCUMENTS_DIR - The folder that stores the live documentation website
::   FLO_DOCUMENTS_BAK - The folder that will be used to store a backup of the live documentation website
::   FLO_ZIP_INPUT_DIR - The folder that will be used to store temporary files for creating a documentation zip file later
::
::   FLO_ZIP_FILE_PATH - The zip file that will store the hard copies of the documentation
::
::   FLO_REVIS_LOCAL_PATH - The log file that stores the SvnInfo output from the previous export attempt
::   FLO_REVIS_REPOS_PATH - The log file that stores the SvnInfo output from the repository at the time of the batch file started running
::
set FLO_DOCUMENTS_DIR=C:\Inetpub\documentation
set FLO_DOCUMENTS_BAK="C:\Inetpub\Backup\Web Documentation\%date:/=-%"
set FLO_ZIP_INPUT_DIR=C:\SCRIPTS\ExportFlowDocs\Temp\ZipDocs
set FLO_ZIP_FILE_PATH=%FLO_DOCUMENTS_DIR%\Documentation.zip
set FLO_REVIS_LOCAL_PATH=C:\SCRIPTS\ExportFlowDocs\Log\LocalSvnInfo.txt
set FLO_REVIS_REPOS_PATH=C:\SCRIPTS\ExportFlowDocs\Log\ReposSvnInfo.txt