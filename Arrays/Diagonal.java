package Arrays;

public class Diagonal {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 3, 4, 5 }, { 5, 6, 7 } };
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    s = s + a[i][j];
                }
            }
        }
        System.out.println(s);
    }
}
