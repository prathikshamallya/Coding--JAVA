import java.util.*;

public class fseclarg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the no of elements in an array: ");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
       }
       System.out.println("The array before sorting is: ");
       for(i=0;i<n;i++)
       {
        System.out.print(" "+a[i]);
       }

       //sort the array

       for(i=0;i<n-1;i++){
        for(j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
       }
       System.out.println();
       System.out.println("Elements after sorting");
       for(i=0;i<n;i++)
       {
        System.out.print(" "+a[i]);
       }

       //find second largest element in the array
       System.out.println();
        System.out.println("The secong largest element in the array is : "+a[n-2]);
    }
}