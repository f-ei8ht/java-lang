package NumberSystem;

public class AnyBaseToDecimal {

    public static void anyBaseToDecimal(int binNum, int base) {
        int resNum = 0, power = 0;
        while (binNum > 0) {
            resNum += (binNum % 10) * Math.pow(base, power);
            binNum /= 10;
            power++;
        }
        System.out.println(resNum);
    }

    public static void main(String[] args) {
        anyBaseToDecimal(15, 8);
    }
}
