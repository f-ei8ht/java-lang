package Arrays;

public class Occurence {
    public static void main(String[] args) {
        int element = 5;
        int a[] = { 1, 2, 3, 4 };
        int occur = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                occur++;
            }
        }
        if (occur > 0) {
            System.out.println("Occured this many times" + occur);
        } else
            System.out.println("Not occured");
    }
}