#!/bin/bash

# Define colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[0;33m'
CYAN='\033[0;36m'
BOLD='\033[1m'
NC='\033[0m'  # No Color

# Check if a file argument is provided
if [ "$#" -ne 1 ]; then
    echo -e "${RED}Usage: $0 <File.java>${NC}"
    exit 1
fi

# Get the file name and search for it in the project directory
FILE_NAME=$1
CURRENT_DIR=$(pwd)
ROOT_DIR=$(git rev-parse --show-toplevel 2>/dev/null || echo "$CURRENT_DIR")
FILE_PATH=$(find "$ROOT_DIR" -name "$FILE_NAME" 2>/dev/null | head -n 1)

# Check if the file exists
if [ -z "$FILE_PATH" ]; then
    echo -e "${RED}Error: File '$FILE_NAME' not found in the project directory!${NC}"
    exit 1
fi

# Extract the directory and file name
DIR=$(dirname "$FILE_PATH")
BASENAME=$(basename "$FILE_PATH" .java)
RELATIVE_DIR=$(realpath --relative-to="$ROOT_DIR" "$DIR")
PACKAGE=$(echo "$RELATIVE_DIR" | tr '/' '.')

# Display file details
echo -e "${CYAN}==================== Running Java Program ====================${NC}"
echo -e "${CYAN}File Name   : $FILE_NAME${NC}"
echo -e "${CYAN}File Path   : $FILE_PATH${NC}"
echo -e "${CYAN}Package Name: $PACKAGE${NC}"
echo -e "${CYAN}Root Folder : $ROOT_DIR${NC}"
echo -e "${CYAN}=============================================================${NC}"

# Navigate to the root directory for consistent classpath
cd "$ROOT_DIR" || exit

# Compile the Java file
echo -e "${YELLOW}==================== Compiling Java File =====================${NC}"
echo -e "${YELLOW}Compiling $FILE_NAME...${NC}"
javac "$FILE_PATH"
if [ $? -ne 0 ]; then
    echo -e "${RED}Compilation failed!${NC}"
    exit 1
fi
echo -e "${GREEN}Compilation successful.${NC}"
echo -e "${YELLOW}=============================================================${NC}"

# Inform the user about the temporary .class file
echo -e "${BOLD}${YELLOW}==============================================================${NC}"
echo -e "${BOLD}${YELLOW}   ATTENTION: A temporary .class file has been created.       ${NC}"
echo -e "${BOLD}${YELLOW}   Don't worry, it will be automatically deleted after execution.${NC}"
echo -e "${BOLD}${YELLOW}==============================================================${NC}"

# Run the compiled Java program
echo -e "${CYAN}==================== Executing Java Program ==================${NC}"
echo -e "${CYAN}Executing Java program...${NC}"
if [ "$PACKAGE" != "." ]; then
    java "$PACKAGE.$BASENAME"
else
    java "$BASENAME"
fi
echo -e "${CYAN}=============================================================${NC}"

# Delete the .class file(s)
CLASS_FILES=$(find "$DIR" -name "$BASENAME.class")
if [ -n "$CLASS_FILES" ]; then
    echo -e "${YELLOW}==================== Deleting .class File ===================${NC}"
    echo -e "${YELLOW}Deleting temporary .class file(s):${NC}"
    echo -e "${CYAN}  $(basename "$CLASS_FILES")${NC}"
    rm -f "$CLASS_FILES"
    echo -e "${GREEN}Temporary .class file(s) removed. Your workspace is clean.${NC}"
    echo -e "${YELLOW}=============================================================${NC}"
fi

echo -e "${GREEN}==================== Execution Completed =====================${NC}"
echo -e "${GREEN}Exiting.${NC}"