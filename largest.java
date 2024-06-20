import java.util.*;

public class largest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("The Largest among the array is"+max);
        sc.close();
    }
}
