package Challenge8;

public class PrintAllDivisors {
    public static void printAllDivisors(int num) {
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sum = sum + i;
                int otherDivisors = num / i;
                if (otherDivisors != i) {
                    System.out.print(otherDivisors + " ");
                    sum = sum + otherDivisors;
                }
            }
        }
        System.out.println(sum - num);
    }

    public static void main(String[] args) {
        printAllDivisors(28);
    }
}
