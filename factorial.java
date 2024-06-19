import java.util.*;

public class factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to find the factorial");
        int n=sc.nextInt();
        System.out.println("The factorial of the number "+n+" is "+fact(n));
        sc.close();
    }

    public static int fact(int n) {
        if(n==11||n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}