package Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 4 };
        if (isAsc(a) || isDec(a)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    public static boolean isAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < arr[i + 1])
                return false;

        }
        return true;
    }

    public static boolean isDec(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;

        }
        return true;
    }
}
