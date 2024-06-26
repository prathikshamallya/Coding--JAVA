import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class removeVowels {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            String result = removeVowel(s);
            System.out.println(result);
        }
    }

    static String removeVowel(String S) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if (vowels.indexOf(currentChar) == -1) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
