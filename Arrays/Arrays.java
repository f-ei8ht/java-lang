package Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[];
        a = new int[4];
        a[0] = 2;
        // System.out.println("Enter array elements: ");
        // for (int i = 0; i < a.length; i++) {
        // a[i] = sc.nextInt();
        // }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array element " + i + ": " + a[i] + ", ");
        }
        sc.close();
    }
}