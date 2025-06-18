package Challenge11;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter a number: ");
            String input = sc.next();
            try {
                int num = Integer.parseInt(input);
                count++;
                if (num < 0) {
                    System.out.println("Negative Integer encountered, skipped.");
                    continue;
                } else {
                    sum = sum + num;
                }
            } catch (Exception e) {
                System.out.println(e + " - Please enter an integer");
            }
            if (count % 10 == 0) {
                System.out.println("Hey 10 numbers up wanna stop Y/N?");
                String stop = sc.next();
                if (stop.equals("Y")) {
                    break;
                } else {
                    continue;
                }
            }
        }
        System.out.println("Sum of all positive integers: " + sum);
        sc.close();
    }
}
