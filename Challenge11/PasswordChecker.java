package Challenge11;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        do {
            System.out.println("Enter the password");
            password = sc.next();
        } while (!isValid(password));
        System.out.println("Password is valid");
    }

    static boolean isValid(String password) {
        return password.length() >= 8;
    }
}