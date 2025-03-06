package Challenge7;

public class Twentyseven {
    public static void main(String[] args) {
        int n = 17;
        System.out.println((n | 1) == n ? "Odd" : "even");
        System.out.println((n & 1) == 1 ? "Odd" : "even");
        System.out.println((n ^ 1) == (n - 1) ? "Odd" : "even");
        System.out.println(~n == -(n + 1) ? "Odd" : "even");
        System.out.println(~n);
    }
}
