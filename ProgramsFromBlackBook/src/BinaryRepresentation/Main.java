package BinaryRepresentation;

public class Main {
    public static void main(String[] args) {
        int b = 0b1010;
        System.out.println(b);
        System.out.printf("%d", b);
        System.out.println();
        System.out.printf("%x", b);
        System.out.println();
        System.out.printf("%o", b);
        System.out.println();
        System.out.printf("%d", b);
        System.out.println();
        System.out.printf(Integer.toBinaryString(b));
    }
}
