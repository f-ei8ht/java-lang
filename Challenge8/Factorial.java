package Challenge8;

public class Factorial {
    public static int fact(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        int result = fact(5);
        System.out.println(result);
    }
}