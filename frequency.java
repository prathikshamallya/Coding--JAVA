import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the index");
        int p=sc.nextInt();
        frequencyCount(a, n,p);
        sc.close();
    }


    public static void frequencyCount(int a[], int n,int p)
    {
        int frq[]=new int[n];
        for(int i=0;i<n;i++){
            if(a[i]>0&&a[i]<=n){
                frq[a[i]-1]++;
            }
        }
        for(int i=0;i<n;i++){
            a[i]=frq[i];
        }

        System.out.println("The frequency array is");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
