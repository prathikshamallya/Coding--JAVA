import java.util.Scanner;
public class matrixAdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows and columns of the matrix");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        System.out.println("Enter the matrix A elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the matrix B elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[a.length][b.length];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The addition of the marix is");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
