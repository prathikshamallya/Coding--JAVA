import java.util.Arrays;
import java.util.Scanner;

class ArrangedString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(arrangeString(s));
        }
    }

    public static String arrangeString(String s) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                s1.append(ch);
            }
            if (!Character.isDigit(ch)) {
                s2.append(ch);
            }
        }
        char[] ar = s2.toString().toCharArray();
        Arrays.sort(ar);
        String res = new String(ar);

        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            sum += Character.getNumericValue(s1.charAt(i));
        }

        return res + (sum == 0 ? "" : sum);
    }
}
