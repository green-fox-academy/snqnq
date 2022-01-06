@echo off
set /A a = 5
set /A b = 10
set /A c = %a% + %b%
echo %c%
set /A c = %a% - %b%
echo %c%
set /A c = %b% * %a%
echo %c%
set /A c = %b% / %a%
echo %c%