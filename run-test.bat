@echo off
setlocal

if "%~1"=="" (
    echo Solution directory is required.
    exit /b 1
)

pushd "%~1"

javac Main.java

if errorlevel 1 (
    echo.
    echo COMPILE ERROR!
    popd
    exit /b 1
)

java Main < input.txt > output.txt

if errorlevel 1 (
    echo.
    echo RUNTIME ERROR!
    popd
    exit /b 1
)

fc expected.txt output.txt > nul

if errorlevel 1 (
    echo.
    echo DIFFERENT!
    echo.
    fc expected.txt output.txt
    set result=1
) else (
    echo.
    echo SAME!
    set result=0
)

popd
exit /b %result%