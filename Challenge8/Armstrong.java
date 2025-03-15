package Challenge8;

public class Armstrong {
    public static void main(String[] args) {
        int n = 372;
        int p = n;
        int s = 0;
        while (p > 0) {
            s += Math.pow(p % 10, 3);
            p /= 10;
        }
        System.out.println(s == n ? "Armstrong" : "not armstrong");
    }
}