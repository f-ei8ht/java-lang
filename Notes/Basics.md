## Files Extensions
`.java[sourcecode]` and `.class [bytecode]`

## JDK VS JVM VS JRE
JDK : it includes jre, interpreter/loader (java), javac
javadoc


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
        
        style A fill:#f9f,color:#000
        style JRE fill:#fff2b2,color:#000
        style B fill:#b7e892,color:#000
        style C fill:#ff9090,color:#000
        end
        style JDK fill:#dff2ff,color:#000
    end