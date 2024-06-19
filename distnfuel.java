import java.util.*;

public class distnfuel {

    public static void calc(float dist,float fuel){
        Scanner sc=new Scanner(System.in);
        float economy=dist/fuel;
        System.out.println("The Average economy of fuel is : "+economy);
        System.out.println();
        while(true){
            System.out.println("-----Enter you Choice: (Press 0 to exit)------");
            System.out.println("1.Distance Estimation");
            System.out.println("2.Fuel Estimation");
            int choice=sc.nextInt();
          switch(choice){
            case 1:
                System.out.print("Enter the Distance Travelled :");
                int newdist=sc.nextInt();
                System.out.println("The fuel estimation of "+newdist+ " is "+(newdist/economy));
                break;
            case 2:
                System.out.print("Enter the fuel used: ");
                int newfuel=sc.nextInt();
                System.out.println("The distance estimation of "+newfuel+" is "+(newfuel*economy));
                break;
            default:
                System.out.println("Invalid choice....Please try again");
          }
          if(choice==0){
            break;
          }

        }
    }

    // public static void calcdist(float dist,float fuel){
        
        

    // }

    // public static void estimation(float dist,float fuel){
    //     Scanner sc=new Scanner(System.in);
        
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Distance :");
        float dist=sc.nextFloat();
        System.out.println("Enter the fuel consumed(in Ltr) :");
        float fuel=sc.nextFloat();
        calc(dist, fuel);
    }
}
