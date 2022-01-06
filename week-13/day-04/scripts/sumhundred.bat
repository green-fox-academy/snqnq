@echo off

setlocal enabledelayedexpansion
set counter=0

for /L %%i in (1,1,100) do (
    set /A counter+=%%i
    echo !counter!
    )

    echo !counter!

endlocal