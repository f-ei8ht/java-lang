package Challenge5;

public class Thirteen {
    public static void main(String[] args) {
        double p = 1000;
        double r = 5;
        double n = 3;
        double a = Math.pow((1 + (r / 100)), n) * p;
        System.out.println(a - p);
    }
}
