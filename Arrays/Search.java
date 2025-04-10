package Arrays;

public class Search {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 5 }, { 3, 4 } };
        System.out.println(a.length);
        int num = 5;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == num) {
                    System.out.println("The number's first occurrence is at [" + i + "][" + j + "]");
                    return; // stop after first occurrence
                }
            }
        }
    }
}
