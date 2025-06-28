package Strings;

public class StringPrintf {
    public static void main(String[] args) {
        int num = 1234;
        double price = 19.99;
        String name = "Product";

        // These produce identical formatting:
        String formatted = String.format("%-15s: $%8.3f (ID: %04d)", name, price, num);
        System.out.printf("%-15s: $%8.3f (ID: %05d)%n", name, price, num);

        // Output: "Product : $ 19.99 (ID: 1234)"
        System.out.println(formatted);
    }
}
