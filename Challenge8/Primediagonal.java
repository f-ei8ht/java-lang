package Challenge8;

public class Primediagonal {
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i = i + 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int largestDiagonalPrime(int[][] nums) {
        int size = nums.length;
        int maxPrime = 0;
        // main diagonal
        for (int i = 0; i < size; i++) {
            int mainVal = nums[i][i];
            if (isPrime(mainVal)) {
                maxPrime = Math.max(maxPrime, mainVal);
            }
            // anti diagonal
            int antiVal = nums[i][size - 1 - i];
            if (i != size - 1 - i && isPrime(antiVal)) {
                maxPrime = Math.max(maxPrime, antiVal);
            }
        }
        return maxPrime;

    }
}