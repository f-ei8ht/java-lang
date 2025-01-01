## Files Extensions
`.java [sourcecode]` and `.class [bytecode]`

## JDK VS JVM VS JRE

```mermaid
graph TD
    subgraph JDK["JDK (Java Development kit)"]
        A[Java Development 
        Tools. Like javac, 
        jdoc, java etc.]
        subgraph JRE["JRE"]
            B["JVM
            (Java Virtual Machine)"]
            C[Set of java Libraries. 
            Like java.lang, java.util,etc.]
        
        style A fill:#fff,color:#000
        style JRE fill:#fff,color:#000
        style B fill:#b7e892,color:#000
        style C fill:#ff9090,color:#000
        end
        style JDK fill:#dff2ff,color:#000,width:670px,height:370px
    end
```


###### `JDK`  : it includes JRE, interpreter/loader (java), javac javadoc, and other tools needed for Java Development. Essentially, JDK is superset of JRE.

###### `JRE` : it is a part of JDK, but can be downloaded seprately. Provides libraries, the JVM, and other components to run application.

###### `JVM` : its a part of JRE and is responsible for executing the bytecode. "WORA" capability. Not platform independent.