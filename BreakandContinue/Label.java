package BreakandContinue;

public class Label {
    public static void main(String[] args) {
        outerLoop: // this is a label
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 5)
                    break outerLoop;
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
