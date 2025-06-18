package Challenge11;

import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        while (true) {
            s = sc.next();
            if (s.equals("exit")) {
                break;
            }
        }
        sc.close();
    }
}
