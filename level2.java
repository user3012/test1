import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class level2 {
    public static void main(String[] args) {
        String str1 = "acbdw,12695,47AasIDX";
        String s [] = str1.split(",");
        int i;

        for (i=0;i<=2;i++){
            String str2 = s[i];
             if(!(isNumber(str2))) {
                 for (i = 0; i < s[i].length(); i++) {
                     char []c = str2.charAt(i);
                     if (!(c >= 97 && c <= 122)) {
                         str2.toUpperCase();
                     }
                 }

             }

        }







    }

}
