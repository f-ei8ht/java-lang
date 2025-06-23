package Challenge11;

public class Pal {
    public static void main(String[] args) {
        String s = "nitin";
        System.out.println(isPal(s) ? "Palindrome" : "Not Palindrome");
    }

    static boolean isPal(String str) {
        if (str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        return isPal(str.substring(1, str.length() - 1));
    }
}