::
:: ExportFloDocs.bat © Flow Software Limited 2011
::   Version History
::     1.0: 2011-Nov-03 by Daniel Schealler
::            Created initial batch file and associated vbs script.
::

CALL SetVariables.bat
@ECHO ExportFloDocs.bat v1.0 © Flow Software Limited 2011

::
:: Load the current repository information for the root help path from svn and extract the latest revision number into FLO_REVIS_REPOS
::
%FLO_SLIKSVN_PATH% info %FLO_REPO_HELP_ROOT_PATH% --username %FLO_USERNAME% --password %FLO_PASSWORD% --depth=empty --no-auth-cache --non-interactive --trust-server-cert --revision HEAD > %FLO_REVIS_REPOS_PATH%
for /F "tokens=1,2* delims=:" %%i in (%FLO_REVIS_REPOS_PATH%) do if  "%%i"=="Last Changed Rev" for /F "tokens=* delims= " %%x in ("%%j") do SET FLO_REVIS_REPOS=%%x

:: 
:: Open the local svn info for the previous export and extract the latest revision number into FLO_REVIS_LOCAL
::
for /F "tokens=1,2* delims=:" %%i in (%FLO_REVIS_LOCAL_PATH%) do if  "%%i"=="Last Changed Rev" for /F "tokens=* delims= " %%x in ("%%j") do SET FLO_REVIS_LOCAL=%%x

ECHO Local Revis: %FLO_REVIS_LOCAL%
ECHO Repos Revis: %FLO_REVIS_REPOS%

if %FLO_REVIS_REPOS% gtr %FLO_REVIS_LOCAL% ECHO Repos is greater than Local
if not %FLO_REVIS_REPOS% gtr %FLO_REVIS_LOCAL% ECHO Repos is not greater than Local

if not %FLO_REVIS_REPOS% gtr %FLO_REVIS_LOCAL% GOTO ZipEnd

if not %FLO_DO_WEB%==1 GOTO WebEnd

:Web
:: 
:: If it exists, remove the documentation backup
::
rd /S /Q %FLO_DOCUMENTS_BAK% >nul

::
:: Copy the current live documentation over to the backup folder
::
xcopy %FLO_DOCUMENTS_DIR% %FLO_DOCUMENTS_BAK% /E /I /Q >nul

::
:: Clear out the live documentation folder. Note that we cannot call rd on the documentation folder itself because we would
:: lose the NT permissions on that folder. Instead we are going to delete all the files in that folder structure, then clear
:: out each subdirectory by calling rd on it specifically.
::
del %FLO_DOCUMENTS_DIR%\* /Q /S >nul
for /D %%I in ("%FLO_DOCUMENTS_DIR%\*") do rd /S /Q "%%I" >nul

::
:: Export the latest build of the website source from Subversion
::
%FLO_SLIKSVN_PATH% export %FLO_REPO_HELP_WEB_PATH% %FLO_DOCUMENTS_DIR% --username %FLO_USERNAME% --password %FLO_PASSWORD% --depth=infinity --force --quiet --no-auth-cache --non-interactive --trust-server-cert
%FLO_SLIKSVN_PATH% info %FLO_REPO_HELP_ROOT_PATH% --username %FLO_USERNAME% --password %FLO_PASSWORD% --depth=empty --no-auth-cache --non-interactive --trust-server-cert --revision HEAD > %FLO_REVIS_LOCAL_PATH%

:WebEnd

if not %FLO_DO_Zip%==1 GOTO ZipEnd

:Zip
::
:: Remove (just in case) and then recreate the temporary zip folder
::
rd %FLO_ZIP_INPUT_DIR% /Q /S >nul
mkdir %FLO_ZIP_INPUT_DIR% >nul

:: 
:: Export in only the files to be zipped from subversion to the temporary zip folder
::
%FLO_SLIKSVN_PATH% export %FLO_REPO_HELP_ROOT_PATH% %FLO_ZIP_INPUT_DIR% --username %FLO_USERNAME% --password %FLO_PASSWORD% --depth=files --force --quiet --no-auth-cache --non-interactive --trust-server-cert

::
:: Pause for a second to make sure that SlikSvn has a chance to finish up with any outstanding files
::
ping -n 1 127.0.0.1 >nul

::
:: Delete any non-chm files
::
for %%I in ("%FLO_ZIP_INPUT_DIR%\*") do if not %%~xI==.chm del /Q /F "%%I" >nul

::
:: zip.vbs
:: 
::  Is an associated vbs script file for ExportFloDocs.bat. It may be recreated from the comment section below by
::  removing the batch-level comment symbols.
:: 
:: 'Get command-line arguments.
:: Set objArgs = WScript.Arguments
:: InputFolder = objArgs(0)
:: ZipFile = objArgs(1)
:: 
:: 'Create empty ZIP file.
:: CreateObject("Scripting.FileSystemObject").CreateTextFile(ZipFile, True).Write "PK" & Chr(5) & Chr(6) & String(18, vbNullChar)
:: 
:: Set objShell = CreateObject("Shell.Application")
:: 
:: Set source = objShell.NameSpace(InputFolder).Items
:: 
:: objShell.NameSpace(ZipFile).CopyHere(source)
:: 
:: 'Required!
:: wScript.Sleep 2000
::
CScript zip.vbs %FLO_ZIP_INPUT_DIR% %FLO_ZIP_FILE_PATH% >nul

if not %FLO_DO_ZIP_CLEANUP%==1 GOTO ZipEnd

:ZipCleanup
::
:: Cleanup: Remove the temporary zip folder
::
rd %FLO_ZIP_INPUT_DIR% /Q /S

:ZipEnd

:End
if not %FLO_DO_PAUSE%==1 GOTO TrueEnd
pause

:TrueEnd