package one;

import static one.Demo.*;

public class Test {

    // this is form default as it cannot be accesses outside a package
    public static void main(String[] args) {
        System.out.println(add2(1, 2));
    }
}

class Child extends Demo {
    public static void main(String[] args) {
        System.out.println(add4(4, 5));
    }
}