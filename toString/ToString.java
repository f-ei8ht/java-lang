package toString;

import java.util.Arrays;

public class ToString {
    public static void main(String[] args) {
        String s = "saif";
        System.out.println(s.toString());
        int[] a = { 1, 2, 3 };
        System.out.println(a); // internally working with append and string builders will return the
                               // array with square brackets and values seprated by commas
    }
}
