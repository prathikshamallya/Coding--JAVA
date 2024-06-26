import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements in the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The array elements are " );
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(a[i]);
        }
        Collections.sort(ar);
        System.out.println("The sorted list are");
        for(int i:ar){
            System.out.println(i);
        }
        sc.close();
    }
}
