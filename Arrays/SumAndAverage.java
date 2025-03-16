package Arrays;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };

        int s = 0;

        for (int i = 0; i < a.length; i++) {
            s = s + a[i];
        }
        System.out.println("Sum:" + s);
        System.out.println("Average: " + s / a.length);

    }
}
