import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class level3 {

    public static void main(String[] args) {
        String str1 = "acbdw,12695,47AasIDX";
        String s[] = str1.split(",");
        int i;
        for (i = 0; i <= 2; i++) {
            String str2 = s[i];
        }
           number();
           String str3 = upper(str1);

    }

    public static boolean number() {
        String str1 = "acbdw,12695,47AasIDX";
        String s[] = str1.split(",");
        int i;
        boolean result = true;
        for (i = 0; i <= 2; i++) {
            String str2 = s[i];
            if (!(isNumber(str2))) {
                for (i = 0; i < s[i].length(); i++) {
                    char c = str2.charAt(i);
                    if (!(c >= 97 && c <= 122)) {
                         result = false;
                        System.out.println(false);
                    } else {
                                 result = true;
                                System.out.println(true);
                    }

                }

            }
        }
                       return result;
    }

    public static String upper(String str) {
        String str1 = "acbdw,12695,47AasIDX";
        String s[] = str1.split(",");
        int i;
        for (i = 0; i <= 2; i++) {
            String str2 = s[i];
            if (str2.contains(s[i])) {
                for (i = 0; i < s[i].length(); i++) {
                    char c = str2.charAt(i);
                    if (!(c >= 97 && c <= 122)) {
                        str2.toUpperCase();
                    }

                }

            }

        }
                      return str2;
    }
}