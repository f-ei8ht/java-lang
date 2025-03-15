package Challenge8;

public class Palinrome {
    public static void main(String[] args) {
        int n = 121;
        int p = n;
        int rev = 0;
        while (p > 0) {
            rev = rev * 10 + p % 10;
            p /= 10;
        }
        System.out.println(rev);
        System.out.println((rev == n) ? "Palinrome" : "Not");
    }
}
