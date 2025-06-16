package Challenge11;

import java.util.Scanner;
import static RandomNumber.RandomNum.*;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess = randomNum(1, 1);
        int n;
        do {
            System.out.println("Guess the number");
            n = sc.nextInt();
        } while (n != guess);
        System.out.println("you guess correctly");
    }
}
