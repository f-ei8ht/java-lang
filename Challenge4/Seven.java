package Challenge4;

public class Seven {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        a += b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
