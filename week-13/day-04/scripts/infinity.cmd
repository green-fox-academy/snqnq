@echo off

set /a counter=1
:infinite
echo Loop number -^>%counter%
set /a counter=%counter%+1
timeout /t 1 /nobreak
if %counter% NEQ 0 goto infinite
exit