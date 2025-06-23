package MathsClass;

public class M {
    public static void main(String[] args) {
        var value = 3.14;
        int v = 3;
        System.out.println(value == v);
        System.out.println(Math.abs(-9) + " " + Math.abs(9) + " " + Math.abs(9.9));
        System.out.println(Math.ceil(9.1)); // 10.0 anything 9.9 9.5 9.1
        System.out.println(Math.round(9.2)); // returns long works similar to round // off in maths 9.2 = 9 9.5 = 10 9.9
                                             // = 10
        System.out.println(Math.floor(9.9)); // enter any thing it will be 9.0 only
        System.out.println(Math.max(-0.0, 0.0));
        System.out.println(Math.min(0.0f, -0.0f));
        System.out.println(Math.pow(value, v));
        System.out.println(Math.PI);
        System.out.println(Math.abs(-1.1));
    }
}
