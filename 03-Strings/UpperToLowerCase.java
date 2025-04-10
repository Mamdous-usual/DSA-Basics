public class UpperToLowerCase {
   public static void main(String[] args) {
      
       String st = "wElcoMEtoScAleR";
       uppserCaseToLowerCase(st);
}

public static void uppserCaseToLowerCase(String st) {
    char[] s = st.toCharArray();

    for (int i = 0; i < s.length; i++) {
        char ch = s[i];

        if (ch >= 'A' & ch <= 'Z') {

            char chans = (char)(ch - 'A' + 'a');
            s[i] = chans;
        }
   }

   for (char c : s) {
       System.out.print(c);
   }

}

}
