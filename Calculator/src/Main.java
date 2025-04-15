import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Main obj = new Main();

        System.out.println("Welcome to CLI Calculator");

//        boolean isValid = false;

        while (true) {
            System.out.print("\nPlease Enter an operation (+ , - , * , / , %, p or P, r or R): ");
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
                    if (sc.hasNextInt()) {
                        int subNums = sc.nextInt();
                        if (subNums > 1) {
                            int[] subArray = new int[subNums];
                            System.out.println("\nEnter the numbers: ");
                            for (int i = 0; i < subArray.length; i++) {
                                while (!sc.hasNextInt()) {
                                    System.out.println("This is not a valid integer");
                                    sc.next();
                                }
                                subArray[i] = sc.nextInt();
                            }
                            if (subArray.length == 2) {
                                System.out.println("Subtraction if (a - b): " + (subArray[0] - subArray[1]));
                                System.out.println("Subtraction if (b - a): " + (subArray[1] - subArray[0]));
                            } else {
                                int sub = subArray[0];
                                for (int i = 1; i < subArray.length; i++) {
                                    sub -= subArray[i];
                                }
                                System.out.println("Subtraction between " + subArray.length + " numbers: " + sub);
                            }
                            break;
                        } else {
                            System.out.println("Please enter an integer greater than 1");
                        }
                    } else {
                        System.out.println("\nThis is not a valid integer.");
                        sc.next();
                    }
                }
                break;
            case '*':
                while(true) {
                    System.out.print("\nHow many numbers you want to multiply");
                    if(sc.hasNextInt()) {
                        int mulNums = sc.nextInt();
                        if(mulNums > 1) {
                            System.out.println("\nEnter the numbers: ");
                            int mul = 1;
                            for(int i = 0; i < mulNums; i++) {
                                while(!sc.hasNextInt()) {
                                    System.out.println("This is not a valid Integer");
                                    sc.next();
                                }
                                int num = sc.nextInt();
                                mul *= num;
                            }
                            System.out.println("Multiplication: " + mul);
                            break;
                        } else {
                            System.out.println("\nPlease Enter an integer greater than 1");
                        }
                    } else {
                        System.out.println("\nThis is not a valid integer");
                        sc.next();
                    }
                }
                break;
            case '/':
                while(true){
                    System.out.print("\nHow many numbers you want to divide: ");
                    if(sc.hasNextInt()){
                        int divNums = sc.nextInt();
                        if(divNums > 1) {
                            int[] divArray = new int[divNums];
                            System.out.println("\nEnter the numbers");
                            for(int i = 0; i < divArray.length; i++) {
                                while(!sc.hasNextInt()){
                                    System.out.println("This is not a valid integer");
                                    sc.next();
                                }
                                divArray[i] = sc.nextInt();
                            }
                            if(divArray.length == 2) {
                                System.out.println("Division if (a/b): " + ((double)divArray[0] / (double)divArray[1]));
                                System.out.println("Division if (b/a): " + ((double)divArray[1] / (double)divArray[0]));
                            } else {
                                double div = divArray[0];
                                for(int i = 1; i < divArray.length; i++) {
                                    div /= divArray[i];
                                }
                                System.out.println("Division of " + divArray.length + " numbers: " + div);
                            }
                            break;
                        } else {
                            System.out.println("\nPlease Enter a integer greater than 1");
                        }
                    } else {
                        System.out.println("This is not a valid integer");
                        sc.next();
                    }
                }
                break;
//            case '%':
//                while(true)
//                System.out.println("\nHow many numbers you want to mod: ");
//                int modNums = sc.nextInt();
//                System.out.println("\nEnter the numbers: ");
//                int mod = 1;
//                for (int i = 0; i < modNums; i++) {
//                    int num = sc.nextInt();
//                    mod = mod % num;
//                }
//                System.out.println("Modulus " + mod);
//                break;
            case 'p':
            case 'P':
                while(true){
                    System.out.println("\nPlease Enter accordingly number and power: ");
                    if(sc.hasNextInt()) {
                        int n = sc.nextInt();
                        int p = sc.nextInt();
                        int num = 1;
                        if(p == 0){
                            System.out.println(n +" to the power " + p + "is 1");
                        } else if (p % 2 == 0) {
                            int newN = n;
                            n = n * n;
                            for(int i = 1; i <= Math.abs(p) / 2; i++) {
                                num = num * n;
                            }
                            if(p < 0)
                                System.out.println(newN + " to the power " + p + "is: " + (double) 1/ num);
                            else
                                System.out.println(newN + "to the power " +p+ "is: " + num);
                        } else {
                            int newN = n;
                            int go = (Math.abs(p) - 1) / 2;
                            n = n * n;
                            for(int i = 1; i <= go; i++) {
                                num = num * n;
                            }
                            if(p < 0)
                                System.out.println(newN + " to the power " + p + " is: " + (double) 1/ num * ((double) 1/ newN));
                            else
                                System.out.println(newN + " to the power " + p + " is: " + newN * num);
                        }
                        break;
                    } else {
                        System.out.println("Please enter a valid integer");
                        sc.next();
                    }
                }
                break;

            default:
                System.out.println("Unknow operation entered must be (+ , - , * , / , %) only");
                break;
        }
    }
}
