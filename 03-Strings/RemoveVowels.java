import java.util.*;

public class RemoveVowels {
    public static void main(String[] args) {
        String string = "youcandoit";
        removeVowels(string);
    }

    public static void removeVowels(String string) {
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                continue;
            }
            System.out.print(ch);
        }
    }
}
