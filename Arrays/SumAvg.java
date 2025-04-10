package Arrays;

public class SumAvg {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 5 }, { 3, 4 } };
        System.out.println(a.length);
        int s = 0, count = 0;
        double b = 0.0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                s = s + a[i][j];
                count++;
            }
        }
        b = s / count;
        System.out.println(s + " " + b);
    }
}
