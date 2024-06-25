import java.util.*;

public class primeAndComposite{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check if its prime or composite");
        int n=sc.nextInt();
        
        if(isprime(n)){
            System.out.println("It is a prime number");
            for(int i=2;i<=n;i++){
                if(isprime(i))
                System.out.println(" "+i);
            }
        }
        if(!isprime(n)){
            System.out.println("It is a Composite number");
            for(int i=2;i<=n;i++){
                if(!isprime(i))
                System.out.println(" "+i);
            }
        }
        sc.close();
    }

    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }return true;
        }
    }
}