import java.util.*;

public class pyramidstars {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of lines till where to print the star");
        int n=sc.nextInt();
        System.out.println("The stars are");
        for(int i=0;i<n;i++){
            for(int k=0;k<2*(n-i)-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}