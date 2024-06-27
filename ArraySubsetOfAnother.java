import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class ArraySubsetOfAnother {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer stt = new StringTokenizer(br.readLine());

            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int) (n)];
            long a2[] = new long[(int) (m)];

            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }

            String res = isSubset(a1, a2, n, m);
            System.out.println(res);

        }
    }

    public static String isSubset(long a1[], long a2[], long n, long m) {
        ArrayList<Long> a = new ArrayList<>();
        ArrayList<Long> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(a1[i]);
        }
        for (int i = 0; i < m; i++) {
            b.add(a2[i]);
        }
        Collections.sort(a);
        Collections.sort(b);
        int c = 0, d = 0;
        while (c < n && d < m) {
            if (a.get(c).equals(b.get(d))) {
                c++;
                d++;
            } else {
                c++;
            }
        }

        if (d == m) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
