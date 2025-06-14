package Challenge10;

public class Calculate {
    public static void main(String[] args) {

        char ch = '-';
        int a = 10;
        int b = 5;
        switch (ch) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
    }
}
