package Challenge12;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command;
        int max = 6;
        int min = 1;
        while (true) {
            System.out.println("Please Enter the commad");
            command = sc.nextLine();
            if (command.contains("roll")) {
                System.out.println((int) (Math.random() * (max - min + 1)) + min);
                continue;
            } else {
                break;
            }
        }
    }
}
