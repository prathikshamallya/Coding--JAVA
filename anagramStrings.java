import java.util.Arrays;
import java.util.Scanner;

public class anagramStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1:");
        String org1=sc.nextLine();
        System.out.println("Enter the String 2:");
        String org2=sc.nextLine();
        String s1=org1.replaceAll("\\s+", "").trim().toLowerCase();
        String s2=org2.replaceAll("\\s+", "").trim().toLowerCase();
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        if(a.length!=b.length){
            System.out.println("Not a anagaram because size is not equal");
        }else{
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a, b)){
                System.out.println("Strings are Anagram");
            }
            else{
                System.out.println("Strings are not Anagram");
            }
        }

        sc.close();
    }
}
