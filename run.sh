#!/bin/bash

# Check if a file argument is provided
if [ "$#" -ne 1 ]; then
    echo "Usage: $0 <File.java>"
    exit 1
fi

# Get the file name and search for it in the project directory
FILE_NAME=$1
CURRENT_DIR=$(pwd)
ROOT_DIR=$(git rev-parse --show-toplevel 2>/dev/null || echo "$CURRENT_DIR")
FILE_PATH=$(find "$ROOT_DIR" -name "$FILE_NAME" 2>/dev/null | head -n 1)

# Check if the file exists
if [ -z "$FILE_PATH" ]; then
    echo "Error: File '$FILE_NAME' not found in the project directory!"
    exit 1
fi

# Extract the directory and file name
DIR=$(dirname "$FILE_PATH")
BASENAME=$(basename "$FILE_PATH" .java)
RELATIVE_DIR=$(realpath --relative-to="$ROOT_DIR" "$DIR")
PACKAGE=$(echo "$RELATIVE_DIR" | tr '/' '.')

# Navigate to the root directory for consistent classpath
cd "$ROOT_DIR" || exit

# Compile the Java file
javac "$FILE_PATH"
if [ $? -ne 0 ]; then
    echo "Compilation failed!"
    exit 1
fi

# Run the compiled Java program
if [ "$PACKAGE" != "." ]; then
    java "$PACKAGE.$BASENAME"
else
    java "$BASENAME"
fi
