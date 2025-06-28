package Challenge12;

public class Pi {
    public static void main(String[] args) {
        String circle = circle(2);
        System.out.println(circle);
    }

    public static String circle(double r) {
        double area = 2 * Math.PI * (r * r);
        double circumference = 2 * Math.PI * r;
        double diameter = 2 * r;

        return "Circle: " + "{ " +
                "Area: " + area + ", " +
                "Circumference: " + circumference +
                ", " + "Diameter: " + diameter + " }";
    }
}
