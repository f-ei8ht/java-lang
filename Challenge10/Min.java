package Challenge10;

public class Min {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        if (num1 == num2)
            System.out.println("Numbers cannot be equal");
        String result = num1 > num2 ? "Num1 greater" : "Num2 Greater";
        System.out.println(result);
    }
}