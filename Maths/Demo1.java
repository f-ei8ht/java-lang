package Maths;

public class Demo1 {
    public static void main(String[] args) {
        int bits1 = Float.floatToRawIntBits(-0.0f);
        int bits2 = Float.floatToRawIntBits(0.0f);
        System.out.println("Bits of -0.0f: " + bits1);
        System.out.println("Bits of 0.0f: " + bits2);

        if (bits1 == bits2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
