package BreakandContinue;

public class Continue {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2)
                    continue outer;
                System.out.print(j);
            }
        }
    }
}
