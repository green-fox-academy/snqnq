@echo off

choice /C:FL -M "Fiu vagy vagy Lany?"

if errorlevel 2 goto lany
echo Szervusz, fiu...
goto end

:lany
echo Helllo, No!

:end