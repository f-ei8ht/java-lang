package Challenge6;

import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        System.out.println("Enter the no is even or odd");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? "even" : "odd");
    }
}
