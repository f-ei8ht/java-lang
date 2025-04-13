package CountDigitsUsingLog;

public class Main {

    public static void countDigitsUsingLog(int num) {
        int result = (int) (Math.log(num) / Math.log(10)) + 1;
        System.out.println(result);
    }

    public static void main(String[] args) {
        countDigitsUsingLog(12);
    }
}
