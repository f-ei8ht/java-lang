package UnderstandEscapeSequence;

public class Main {
    public static void main(String[] args) {
        System.out.print("HI\nMY\nIS\nSAIF");
        System.out.println();
        System.out.print("HI\tTHERE");
        System.out.println();
        long l = 2200000000L;
        System.out.println(l);
        System.out.println("Hi\fWHERE");
        System.out.println();
        System.out.println("hi\bbackspace"); //hbackspace
        System.out.println("hi\rletsgo"); //letsgo overrides hi
    }
}
