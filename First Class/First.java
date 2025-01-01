import java.util.*; //importing a built in package

public class First { // public is a access specifier and public class First we create a class 
    // if we add public before a class the class name and file name must be same along with case senstivity
    public static void main(String[] args) { // entry point for jvm
        // also we have command line arguments
        System.out.println("Hello world");
        System.out.println("Length of the command line aruguments => " + args.length);
        for(int i = 0; i < args.length; i++) {
            System.out.println("Value of the command line arguments : " + args[i]);
        }
    }
}

// compile the .java file using javac you will get a .class file which contains bytecode and run it using java
// every statement must end with a semicolon
// main method is most important i a java program because jvm looks for it to start execution