@ECHO OFF

::----------------------------------------------------------------------
:: IntelliJ IDEA LightEdit mode script.
::----------------------------------------------------------------------

SET "IDE_BIN_DIR=%~dp0"
CALL "%IDE_BIN_DIR%\idea.bat" -e %*
