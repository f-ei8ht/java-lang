package two;

import static one.Demo.*;

public class Demo {

    // this one is from public
    public static void main(String[] args) {
        System.out.println(add1(1, 2));
    }
}

class Child extends one.Demo { // from protected
    public static void main(String[] args) {
        System.out.println(add4(2, 1));
    }
}