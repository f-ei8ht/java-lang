package Challenge8;

// 0, 1, 1, 2, 3, 5, 8, 13

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int n = 8;
        int b = 1;
        int c;
        System.out.print(a + " " + b);
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
        System.out.println();

    }
}
