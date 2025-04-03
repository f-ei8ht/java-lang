package one;

public class Demo {

    public static int add1(int a, int b) {
        return a + b;
    }

    static int add2(int a, int b) {
        return a + b;
    }

    // private can be accessed only within a class
    private static int add3(int a, int b) {
        return a + b;
    }

    protected static int add4(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add3(2, 3)); // private access
    }
}
// you cannot access private outside this class

class Child extends Demo {

}