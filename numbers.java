import java.util.*;
public class numbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print till...");
        int n=sc.nextInt();
        String a=String.valueOf(n);
        int len=a.length();
        int i,j;
        for(i=1;i<=len;i++){
            for(j=0;j<i;j++){
                System.out.print(a.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}