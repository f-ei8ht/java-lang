import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        App obj = new App();

        while (true) {
            System.out.println("Welcome to CLI Calculator\n");
            System.out.print("Please Enter an operation (+ , - , * , / , %): ");
            String input = sc.next();

            char inputOperation = '\0';

            if (input == null || input.isEmpty() || input.contains(" ")) {
                System.out.println("Input cannot be null or empty or a whitespace");
            } else if (input.length() > 1) {
                System.out.println("Input a single character only");
            } else {
                inputOperation = input.charAt(0);
                obj.calculate(inputOperation);
            }

            System.out.println("want to continue or not y/n");
            char ch = sc.next().charAt(0);
            if (ch == 'n' || ch == 'N') {
                System.out.println("Thanks you for using this calculator");
                break;
            }
        }

        sc.close();
    }

    public void calculate(char choice) {

        switch (choice) {
            case '+':
                System.out.print("\nHow many numbers you want to add:");
                int addNums = sc.nextInt();
                System.out.println("Enter the numbers");
                int sum = 0;
                for (int i = 0; i < addNums; i++) {
                    int num = sc.nextInt();
                    sum = sum + num;
                }
                System.out.println("Addition: " + sum);
                break;
            case '-':
                System.out.println("How many numbers you want to subtract \n");
                int subNums = sc.nextInt();
                System.out.println("Enter the numbers");
                int sub = 0;
                for (int i = 0; i < subNums; i++) {
                    int num = sc.nextInt();
                    sub = num - sub;
                }
                System.out.println("Substraction: " + sub);
                break;
            case '*':
                System.out.println("How many numbers you want to multiply \n");
                int mulNums = sc.nextInt();
                System.out.println("Enter the numbers");
                int mul = 1;
                for (int i = 0; i < mulNums; i++) {
                    int num = sc.nextInt();
                    mul = mul * num;
                }
                System.out.println("Multiplication: " + mul);
                break;
            case '/':
                System.out.println("How many numbers you want to divide \n");
                int divNums = sc.nextInt();
                System.out.println("Enter the numbers");
                int div = 0;
                for (int i = 0; i < divNums; i++) {
                    int num = sc.nextInt();
                    div = div / num;
                }
                System.out.println("Divison: " + div);
                break;
            case '%':
                System.out.println("How many numbers you want to mod \n");
                int modNums = sc.nextInt();
                System.out.println("Enter the numbers");
                int mod = 0;
                for (int i = 0; i < modNums; i++) {
                    int num = sc.nextInt();
                    mod = mod + num;
                }
                System.out.println("Modulus " + mod);
                break;

            default:
                System.out.println("Unknow operation entered must be (+ , - , * , / , %) only");
                break;
        }
    }
}
