@echo off
setlocal EnableDelayedExpansion

:: Define colors
set "RED=[31m"
set "GREEN=[32m"
set "YELLOW=[33m"
set "CYAN=[36m"
set "BOLD=[1m"
set "NC=[0m"

:: Check if a file argument is provided
if "%~1"=="" (
    echo %RED%Usage: %~nx0 File.java%NC%
    exit /b 1
)

:: Get the file name
set "FILE_NAME=%~1"

:: Locate the file starting from the current or git root directory
for /f "delims=" %%i in ('git rev-parse --show-toplevel 2^>nul') do set "ROOT_DIR=%%i"
if not defined ROOT_DIR set "ROOT_DIR=%cd%"

:: Find the file
for /f "delims=" %%f in ('dir /s /b "%ROOT_DIR%\%FILE_NAME%" 2^>nul') do (
    set "FILE_PATH=%%f"
    goto :found
)

echo %RED%Error: File "%FILE_NAME%" not found in the project directory!%NC%
exit /b 1

:found
:: Extract paths
for %%a in ("%FILE_PATH%") do (
    set "DIR=%%~dpa"
    set "BASENAME=%%~na"
)
pushd "%ROOT_DIR%"
set "RELATIVE_DIR=!FILE_PATH:%ROOT_DIR%\=!"
set "RELATIVE_DIR=!RELATIVE_DIR:%FILE_NAME%=!"
set "PACKAGE=!RELATIVE_DIR:\=.!."
set "PACKAGE=!PACKAGE:.=!"
set "PACKAGE=!PACKAGE:~0,-1!"

:: Display file details
echo %CYAN%==================== Running Java Program ====================%NC%
echo %CYAN%File Name   : %FILE_NAME%%NC%
echo %CYAN%File Path   : %FILE_PATH%%NC%
echo %CYAN%Package Name: %PACKAGE%%NC%
echo %CYAN%Root Folder : %ROOT_DIR%%NC%
echo %CYAN%=============================================================%NC%

:: Compile
echo %YELLOW%==================== Compiling Java File =====================%NC%
echo %YELLOW%Compiling %FILE_NAME%...%NC%
javac "%FILE_PATH%"
if errorlevel 1 (
    echo %RED%Compilation failed!%NC%
    exit /b 1
)
echo %GREEN%Compilation successful.%NC%
echo %YELLOW%=============================================================%NC%

:: Warning about temporary .class
echo %BOLD%%YELLOW%==============================================================%NC%
echo %BOLD%%YELLOW%   ATTENTION: A temporary .class file has been created.       %NC%
echo %BOLD%%YELLOW%   Don't worry, it will be automatically deleted after execution.%NC%
echo %BOLD%%YELLOW%==============================================================%NC%

:: Run
echo %CYAN%==================== Executing Java Program ==================%NC%
echo %CYAN%Executing Java program...%NC%
if not "%PACKAGE%"=="." (
    java "%PACKAGE%.%BASENAME%"
) else (
    java "%BASENAME%"
)
echo %CYAN%=============================================================%NC%

:: Clean up .class file
for %%c in ("%DIR%\%BASENAME%.class") do (
    if exist "%%c" (
        echo %YELLOW%==================== Deleting .class File ===================%NC%
        echo %YELLOW%Deleting temporary .class file(s):%NC%
        echo %CYAN%  %%~nxc%NC%
        del /f /q "%%c"
        echo %GREEN%Temporary .class file removed. Your workspace is clean.%NC%
        echo %YELLOW%=============================================================%NC%
    )
)

echo %GREEN%==================== Execution Completed =====================%NC%
echo %GREEN%Exiting.%NC%
popd
