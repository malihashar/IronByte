@echo off
cd /d "%~dp0"
echo Compiling Java files...
javac *.java
if errorlevel 1 (
  echo Compile failed.
  pause
  exit /b 1
)
echo Done. All .class files created.
pause
