package Recursion;

public class Demo {
    public static void main(String[] args) {
        int n = 1;
        print(n);
    }

    static void print(int n) {
        if (n > 5) {
            return;
        }

        print(n + 1);
    }
}