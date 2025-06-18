package Challenge11;

public class Even {
    public static void main(String[] args) {
        int n = 10;
        int odd = 1;
        for (int i = 0; i <= 100; i++) {
            if (i == odd) {
                System.out.println(i);
                odd += 2;
                continue;
            }
        }

    }
}
