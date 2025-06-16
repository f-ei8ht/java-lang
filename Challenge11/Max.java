package Challenge11;

public class Max {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int max = arr[0];
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println(max);
    }
}
