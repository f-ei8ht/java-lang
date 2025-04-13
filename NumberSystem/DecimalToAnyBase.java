package NumberSystem;

public class DecimalToAnyBase {

    public static int decimalToAnyBase(int decimalNumber, int base) {
        int resNum = 0;
        int power = 0;
        while (decimalNumber > 0) {
            resNum += decimalNumber % base * Math.pow(10, power);
            decimalNumber /= base;
            power++;
        }
        return resNum;
    }

    public static void main(String[] args) {
        int result = decimalToAnyBase(5, 2);
        System.out.println(result);
    }
}
