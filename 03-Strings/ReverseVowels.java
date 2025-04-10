public class ReverseVowels {
    public static void main(String[] args) {
        String string = "welcometoscaler";
        reverseVowels(string);
    }

    public static void reverseVowels (String string) {
        char[] ch = string.toCharArray();

        int i = 0;
        int j = ch.length - 1;

        while (i < j) {
            while (ch[i] != 'a' &&ch[i] != 'e' &&ch[i] != 'i' &&ch[i] != 'o' &&ch[i] != 'u') {
                i++;
            }
            
            while (ch[j] != 'a' &&ch[j] != 'e' &&ch[j] != 'i' &&ch[j] != 'o' &&ch[j] != 'u') {
                j--;
            }

            if ( i>= j) {
                break;
            }

            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }

        for (char c : ch) {
           System.out.print(c);
        }
    }
    
}

