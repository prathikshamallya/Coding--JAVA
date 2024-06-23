import java.util.*;


public class matmul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows and columns in an array");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter the Rows and Columns in an "+m+" x "+n+" array");
        int i,j;
        int  a[][]=new int[m][n];
        int b[][]=new int[m][n];
        System.out.println("Enter the elements of 1st array");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd array");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array 1:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Array 2:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        int c[][]=new int[m][n];
        System.out.println("The multiplication of the arrays :");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                c[i][j]=a[i][j]*b[i][j];
            }
        }

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
