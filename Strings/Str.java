package Strings;

public class Str {
    public static void main(String[] args) {
        String a = "saif";
        String b = "ali";
        String c = a + b;
        String d = "saifali";
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println(a == b); // false
        System.out.println((a + b).intern() == c.intern()); // true
        System.out.println(c.intern() == d); // true
        System.out.println(c.equals(d)); // true
        System.out.println(d.equals(c)); // true
        System.out.println(c.equals(a + b)); // true
        System.out.println((a + b).equals(c)); // true
    }
}
