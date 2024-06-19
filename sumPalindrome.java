import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class sumPalindrome {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }

    static class Solution {
        int isDigitSumPalindrome(int n) {
            int sum = 0;
            int rev = 0;
            while (n > 0) {
                int rem = n % 10;
                sum += rem;
                n /= 10;
            }
            int temp = sum; // Store the sum in a temporary variable
            while (temp > 0) {
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp /= 10;
            }
            return sum == rev ? 1 : 0; // Return 1 if sum is equal to its reverse, else return 0
        }
    }
}
