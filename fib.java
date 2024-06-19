import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers to find fionacci");
        int n=sc.nextInt();
        int f0=0,f1=1,f2=0;
        System.out.print(f0+" "+f1);
        for(int i=2;i<n;i++){
            f2=f0+f1;
            System.out.print(" "+f2);
            f0=f1;
            f1=f2;
        }

        }
}
