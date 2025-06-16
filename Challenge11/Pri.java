package Challenge11;

public class Pri {
    public static void main(String[] args) {
        int n = 15;
        if (prime(n)) {
            System.out.println("Not a Prime Number");
        } else {
            System.out.println("Prime Number");
        }
    }

    public static boolean prime(int n) {
        boolean isPrime = false;
        if (n == 0 || n == 1) {
            return !isPrime;
        }
        if (n == 2) {
            return isPrime;
        }
        if (n % 2 == 0) {
            return !isPrime;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                isPrime = true;
                break;
            }
        }
        return isPrime;
    }
}
