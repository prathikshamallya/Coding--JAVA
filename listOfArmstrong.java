import java.util.*;

public class listOfArmstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbr to check if a number is Armstrong..if Yes Print from 0 to n");
        int n=sc.nextInt();
        if(isArm(n)){
            System.out.println(" Yes Armstrong number");
        }else{
            System.out.println("Not an armstrong number");
        }
        printArm(n);
        sc.close();
    }

    public static boolean isArm(int n){
        int org=n,rem=0;
        double arm=0;
        String s=String.valueOf(n);
        int size=s.length();
        while(n!=0){
            rem=n%10;
            arm+=Math.pow(rem,size);
            n/=10;
        }
        return arm==org;
        
    }

    public static void printArm(int n){
        for(int i=1;i<=n;i++){
            if(isArm(i)){
                System.out.print(i+" ");
            }
        }
    }
}
