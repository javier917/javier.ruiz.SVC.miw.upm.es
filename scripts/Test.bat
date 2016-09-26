@echo off
set workspace=D:\MIW master en ingenieria web\Asignatura 1\entregas\control de verisones\javier.ruiz.SVC.miw.upm.es

set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_65

echo -----------------------------------------
echo. (C) MIW
echo -----------------------------------------
echo.
echo Workspace --- %workspace%
echo JAVA_HOME --- %JAVA_HOME%
echo M2_HOME   --- %M2_HOME%
echo.
cd %workspace%
echo ============ mvn clean test (profile: develop) ============
echo.
call mvn clean test
pause

