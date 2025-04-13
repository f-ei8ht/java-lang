package FaxtExponential;

public class Power {

    public static void fastExponential(double num, int power) {
        double result = 1.0;
        long pow = power;
        if (pow < 0) {
            num = 1 / num;
            pow = -pow;
        }

        while (pow > 0) {
            if (pow % 2 != 0) {
                result *= num;
            }
            num *= num;
            pow /= 2;
        }

        System.out.println("Result: " + result);
        System.out.println(Integer.MIN_VALUE);

    }

    public static void main(String[] args) {
        fastExponential(2, -2147483648);
    }
}
