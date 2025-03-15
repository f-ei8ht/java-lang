package Challenge8;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 123, s = 0;
        while (num > 0) {
            s += num % 10;
            num /= 10;
        }
        System.out.println(s);
    }
}
