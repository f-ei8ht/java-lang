package Challenge8;

public class SumOdd {
    public static void main(String[] args) {
        int n = 19, s = 0;
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
            s += i;
        }
        System.out.println(s);
    }
}
