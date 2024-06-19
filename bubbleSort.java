import java.util.*;

public class bubbleSort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements in an array");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The array elements are");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("The array elements after sorting are");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
        
        sc.close();
    }
}