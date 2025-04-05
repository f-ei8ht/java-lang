package Arrays;

public class Delete {
    public static void main(String[] args) {
        int index = 2;
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        if (index < 0 || index > arr.length) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        int[] ar = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (!(i == index)) {
                ar[j++] = arr[i];
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }

    }
}
