import java.util.Scanner;

public class removeLeadingZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String with leading zeros");
        String s=sc.nextLine();
        String nw=" ";
        int n=0;
        for(int i=0;i<s.length()-1;i++){
            char p=s.charAt(i);
            if(p!='0'){
              n=i;
              break;
            }
        }
        nw=s.substring(n, s.length());
        System.out.println(nw);
        sc.close();
    }
}
