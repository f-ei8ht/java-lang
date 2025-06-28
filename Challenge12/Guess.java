package Challenge12;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int max = 10;
        int min = 1;
        int count = 0;
        int r = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Enter your number please");
        while (true) {
            count++;
            if (count > 3) {
                System.out.println("Re run again");
                break;
            }
            n = sc.nextInt();
            if (n == r) {
                System.out.println("Correct");
                break;
            } else {
                System.out.println("Try again, Chances left: " + (3 - count));
                continue;
            }
        }
    }
}
