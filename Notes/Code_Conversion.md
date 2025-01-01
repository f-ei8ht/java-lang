# How does java source code gets converted to machine code?
Firstly the programmers writes the code on any text editor or IDE,
then java compiler compiles the code to byte code which is intermediate code
and is not human readable then the `JVM` converts the byte code to 
machine code 0's and 1's.

```mermaid
flowchart LR
    A["Source Code
    (.java)"] 
    -- Compiler
    (javac) --- B["Bytecode 
    (.class)"] -- JVM
    (java) --- C["OS
    (Native Code)"] .- D["Windows JVM"] & E["Linux JVM"] & F["MacOS JVM"]