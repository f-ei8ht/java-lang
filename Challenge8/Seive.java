package Challenge8;

import java.util.Arrays;

public class Seive {
    public static void seive(int num) {
        if (num <= 2) {
            System.out.println(0);
            return;
        }

        boolean[] arr = new boolean[num];
        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;
        int count = 0;

        // Changed condition from i * i < num to i < num
        for (int i = 2; i < num; i++) {
            if (arr[i]) {
                // This inner loop might not execute if i*i exceeds num
                for (int j = i * i; j < num; j = j + i) {
                    arr[j] = false;
                }
            }
        }

        for (int i = 2; i < num; i++) {
            if (arr[i]) {
                count++;
                // Optional: print the prime numbers for debugging
                // System.out.println("Prime: " + i);
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        seive(3);
    }
}