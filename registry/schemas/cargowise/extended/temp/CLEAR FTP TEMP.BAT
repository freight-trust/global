@echo off
del /q /f "C:\inetpub\ftproot\temp\*"
setlocal
for /f "tokens=*" %%a in ('dir /s /b /ad "C:\inetpub\ftproot\temp\*" 2^>NUL') do rd /s /q "%%a"
