import java.util.*;
public class nonRepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The array elements are:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean isdup=false;
            for(int j=0;j<n;j++){
                if(i!=j&&a[i]==a[j]){
                    isdup=true;
                    break;
                }
            }
            if(!isdup){
                ar.add(a[i]);
            }
        }
        System.out.println();
        System.out.println("The element is");
        System.out.println(ar.get(0));
        sc.close();
    }
}
