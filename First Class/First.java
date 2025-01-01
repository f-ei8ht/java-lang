import java.util.*; //importing a built in package

public class First { // public is a access specifier and public class First we create a class 
    // if we add public before a class the class name and file name must be same along with case senstivity
    public static void main(String[] args) { // entry point for jvm
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world");
        sc.close();
    }
}

// compile the .java file using javac you will get a .class file which contains bytecode and run it using java