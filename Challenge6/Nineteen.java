package Challenge6;

import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perecentage");
        int p = sc.nextInt();
        if (p >= 90 && p <= 100) {
            System.out.println("A");
        } else if (p >= 75 && p < 90) {
            System.out.println("B");
        } else if (p >= 60 && p < 75) {
            System.out.println("C");
        } else if (p >= 30 && p < 60) {
            System.out.println("D");
        } else if (p < 30) {
            System.out.println("F");
        } else if (p > 100 || p < 0) {
            System.out.println("not valid");
        } else {
            System.out.println("No input given");
        }
    }
}
