import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numer to check if its armstrong or not");
        int no=sc.nextInt();
        int n=no;
        int rem,arm=0;
        while(n!=0){
            rem=n%10;
            arm=arm+(rem*rem*rem);
            n=n/10;
        }
        if(arm==no){
            System.out.println("yes its armstrong number");
        }
        else{
            System.out.println("No its not an armstrong number");
        }
    }
}
