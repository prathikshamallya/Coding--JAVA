
    import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

    class arrayEqualNot {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                long t = sc.nextLong();
                
                while (t-- > 0) {
                    int n = sc.nextInt();
                    long arr[] = new long[n];
                    long brr[] = new long[n];
                    
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextLong();
                    }
                    
                    for (int i = 0; i < n; i++) {
                        brr[i] = sc.nextLong();
                    }
                    
                    System.out.println(check(arr, brr, n) == true ? "1" : "0");
                }
            }
        }
    
        // Function to check if two arrays are equal or not.
        public static boolean check(long A[], long B[], int N) {
            ArrayList<Long> a = new ArrayList<>();
            ArrayList<Long> b = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                a.add(A[i]);
                b.add(B[i]);
            }
            Collections.sort(a);
            Collections.sort(b);
            return a.equals(b);
        }
    }
    