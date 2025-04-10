package Arrays;

public class Palindrome {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        boolean isPal = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPal = false;
                break;
            }

        }
        if (isPal) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palaindrome");
        }
    }

}
