package Recursion;

public class Recursion {
    public static void main(String[] args) {
        long n = 3;
        long result = fac((fac(n)));
        System.out.println(result);
    }

    static long fac(long n) {
        if (n == 1)
            return 1;
        return n * fac(--n);
    }
}