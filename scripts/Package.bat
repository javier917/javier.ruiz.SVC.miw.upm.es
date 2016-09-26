@echo off
set workspace=D:\MIW master en ingenieria web\Asignatura 1\entregas\control de verisones\javier.ruiz.SVC.miw.upm.es

set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_65
echo -----------------------------------------
echo . Deploy Pre Production (C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo .
echo .

cd %workspace%

echo ============ mvn -ff clean test (profile: develop) ============
echo .
call mvn -ff clean test
if errorLevel 1 goto errorDevelop


echo ============ mvn -Dmaven.test.skip=true package -Denvironment.type=preproduction ============
echo .
call mvn -Dmaven.test.skip=true package -Denvironment.type=preproduction
if errorLevel 1 goto errorPreproduction



echo ============ mvn -Dmaven.test.skip=true verify -Denvironment.type=preproduction  ============
echo .
call mvn -Dmaven.test.skip=true verify -Denvironment.type=preproduction 
if errorLevel 1 goto errorPreproduction

pause
exit

:errorDevelop
echo .
echo .
echo .
echo ########  ERRORES de test en Develop
pause
exit

:errorPreproduction
echo .
echo .
echo .
echo ########  ERRORES de Test de Integration en Pre-Produccion 
pause
exit
