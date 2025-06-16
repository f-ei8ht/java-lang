package BreakandContinue;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 1000; j++) {
                if (j == 101)
                    break;
                System.out.println(j);
            }
        }
    }
}
