package Arrays;

public class MergeSorted {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7, 9 };
        int arr2[] = { 2, 4, 6, 8, 10 };
        int arr3[] = new int[arr1.length + arr2.length];
        for (int i = 0, j = 0, k = 0; i < arr1.length || j < arr2.length; k++) {
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
