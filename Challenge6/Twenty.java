package Challenge6;

public class Twenty {
    public static void main(String[] args) {
        int age = 13;
        if (age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age < 21) {
            System.out.println("Teen");
        } else if (age >= 21 && age <= 60) {
            System.out.println("Adult");
        } else if (age > 60) {
            System.out.println("Old");
        }
    }
}
