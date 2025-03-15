package Challenge8;

public class Prime {
    public static void main(String[] args) {
        int n = 0;
        boolean isPrime = true;
        if (n <= 1) {
            System.out.println("Prime no are +ve integers greater then one");
            return;
        } else if (n == 2) {
            System.out.println("Prime Number: Fun fact 2 is the only even prime no");
            return;
        } else if (n % 2 == 0) {
            System.out.println("Not a prime no: " + n);
            return;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (!isPrime) {
            System.out.println("Not a prime: " + n);
        } else {
            System.out.println("Prime number: " + n);
        }
    }
}
