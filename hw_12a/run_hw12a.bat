@echo off
cd /d "%~dp0"
echo Compiling all Java files...
javac *.java
if errorlevel 1 (
    echo Compile failed.
    pause
    exit /b 1
)
echo OK.
echo.
echo --- Alphabetical (sample: hello / zebra) ---
(
echo hello
echo zebra
) | java Alphabetical
echo.
echo --- CharToString (sample: Z) ---
echo Z| java CharToString
echo.
echo --- Sentence (sample line) ---
echo cricket practice| java Sentence
echo.
echo --- Word (sample: abcdefghij) ---
echo abcdefghij| java Word
echo.
echo --- Name (sample: jOHN dOE) ---
echo jOHN dOE| java Name
echo.
echo --- Greet (sample: Smith, John) ---
echo Smith, John| java Greet
echo.
pause
