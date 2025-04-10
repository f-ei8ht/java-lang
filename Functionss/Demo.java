package Functionss;

public class Demo {

    public static void main(String[] args) {

        int num1 = 111;
        int num2 = 222;
        System.out.println("static reference call" + swap(num1, num2));
        Demo obj = new Demo();
        obj.swapByValue(num1, num2);
        System.out.println("after call from the main method after using object call" + num1 + " " + num2); // 111 222
                                                                                                           // value do
                                                                                                           // not
        // reflect
        // because a copy is created

    }

    public void swapByValue(int val1, int val2) { // you can use static keyword what is does is you do not have to
                                                  // create an object

        val1 = val1 + val2; // 333
        val2 = val1 - val2; // 111
        val1 = val1 - val2; // 222

        System.out.println("call from the main method using object" + val1 + " " + val2);

    }

    public static String swap(int val1, int val2) {
        val1 = val1 + val2; // 333
        val2 = val1 - val2; // 111
        val1 = val1 - val2; // 222

        return val1 + "" + val2;
    }
}
