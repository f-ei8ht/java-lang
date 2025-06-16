package Challenge11;

public class Occur {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 3 };
        int n = 1;
        int count = 0;
        for (int a : arr) {
            if (a == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
