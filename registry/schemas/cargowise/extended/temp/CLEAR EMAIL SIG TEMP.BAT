@echo off
del /q /f "C:\Temp\SigZip\*"
for /f "tokens=*" %%a in ('dir /s /b /ad "C:\Temp\SigZip\*" 2^>NUL') do rd /s /q "%%a"

del /q /f "C:\Inetpub\wwwroot\SigZip\*"
for /f "tokens=*" %%a in ('dir /s /b /ad "C:\Inetpub\wwwroot\SigZip\*" 2^>NUL') do rd /s /q "%%a"