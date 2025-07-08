package Challenge12;

import java.util.Arrays;

public class Word {
    public static void main(String[] args) {
        String[] words = { "saif", "ali", "khan" };
        System.out.println(Arrays.toString(words));
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            str.append(words[i]).append(" ");
        }
        System.out.println(str.toString().toUpperCase());
    }
}
