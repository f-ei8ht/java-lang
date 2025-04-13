import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Main obj = new Main();

        System.out.println("Welcome to CLI Calculator");

        while (true) {
            System.out.print("\nPlease Enter an operation (+ , - , * , / , %): ");
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

            System.out.print("\nWant to continue or not y/n: ");
            char ch = sc.next().charAt(0);
            if (ch == 'n' || ch == 'N') {
                System.out.println("\nCalculation Ended");
                break;
            }
        }

        sc.close();
    }

    public void calculate(char choice) {

        switch (choice) {
            case '+':
                while(true) {
                    System.out.print("\nHow many numbers you want to add: ");
                    if(sc.hasNextInt()) {
                        int addNums = sc.nextInt();
                        if(addNums > 1) {
                            System.out.println("\nEnter the numbers: ");
                            int sum = 0;
                            for (int i = 0; i < addNums; i++) {
                                while(!sc.hasNextInt()) {
                                    System.out.println("Invalid. This is not an integer");
                                    sc.next();
                                }
                                int num = sc.nextInt();
                                sum += num;
                            }
                            System.out.println("Addition: " + sum);
                            break;
                        } else {
                            System.out.println("\nPlease enter an integer greater than 1");
                        }
                    } else {
                        System.out.println("\nThis is not a valid integer.");
                        sc.next();
                    }
                }
                break;
            case '-':
                while (true) {
                    System.out.print("\nHow many numbers you want to subtract: ");
                    if(sc.hasNextInt()) {
                        int subNums = sc.nextInt();
                        if(subNums > 1) {
                            int[] subArray = new int[subNums];
                            if(subArray.length == 2) {
                                System.out.println("\nEnter the numbers: ");
                                for(int i = 0; i < subArray.length; i++) {
                                    while(!sc.hasNextInt()) {
                                        System.out.println("This is not a valid integer");
                                        sc.next();
                                    }
                                    subArray[i] = sc.nextInt();
                                }
                                System.out.println("Subtraction if, (a - b): " + (subArray[0] - subArray[1]));
                                System.out.println("Subtraction if, (b - a): " + (subArray[1] - subArray[0]));
                                break;
                            }
                        } else {
                            System.out.println("Please enter and integer greater than 1");
                        }
                    } else {
                        System.out.println("\nThis is not a valid integer.");
                        sc.next();
                    }
                }
                break;
            case '*':
                System.out.print("\nHow many numbers you want to multiply");
                int mulNums = sc.nextInt();
                System.out.print("\nEnter the numbers: ");
                int mul = 1;
                for (int i = 0; i < mulNums; i++) {
                    int num = sc.nextInt();
                    mul = mul * num;
                }
                System.out.println("Multiplication: " + mul);
                break;
            case '/':
                System.out.print("\nHow many numbers you want to divide: ");
                int divNums = sc.nextInt();
                System.out.print("\nEnter the numbers: ");
                int div = 1;
                for (int i = 0; i < divNums; i++) {
                    int num = sc.nextInt();
                    div = div / num;
                }
                System.out.println("Divison: " + div);
                break;
            case '%':
                System.out.println("\nHow many numbers you want to mod: ");
                int modNums = sc.nextInt();
                System.out.println("\nEnter the numbers: ");
                int mod = 1;
                for (int i = 0; i < modNums; i++) {
                    int num = sc.nextInt();
                    mod = mod % num;
                }
                System.out.println("Modulus " + mod);
                break;

            default:
                System.out.println("Unknow operation entered must be (+ , - , * , / , %) only");
                break;
        }
    }
}
