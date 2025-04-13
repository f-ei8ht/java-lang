package NumberSystem;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimalNumber = 10;
        int i = 0;
        int[] binary = new int[100];

        while (decimalNumber != 0) {
            binary[i++] = decimalNumber % 2;
            decimalNumber /= 2;
        }

        // Print binary in reverse order (since the least significant bit is stored
        // first)
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }

        System.out.println(); // To add a newline at the end
    }

    public static void other() {
        int decNum = 10;
        int resNum = 0;
        int power = 0;
        while (decNum > 0) {
            resNum += decNum % 2 * Math.pow(10, power);
            decNum /= 2;
            power++;
        }
        System.out.println(resNum);
    }
}
