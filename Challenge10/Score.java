package Challenge10;

public class Score {
    public static void main(String[] args) {
        int num = 45;
        System.out.println(num > 80 ? "High" : num <= 80 && num >= 50 ? "Moderate" : "low");
    }
}
