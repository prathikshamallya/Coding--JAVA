import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class removeDup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int newSize=remDup(a,n);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int remDup(int a[], int n) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(a[i]);
        }
        Collections.sort(ar);
        int i = 0;
        while (i < ar.size() - 1) {
            if (ar.get(i).equals(ar.get(i + 1))) {
                ar.remove(i);
            } else {
                i++;
            }
        }
        for (i = 0; i < ar.size(); i++) {
            a[i] = ar.get(i);
        }
        return ar.size();
    }
    
}
