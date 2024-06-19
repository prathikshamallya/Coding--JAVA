import java.util.*;

public class bmi{

    public static void generatebmi(double kg,double cm){
        double m=convert(cm);
        double BMI=kg/(m*m);
        System.out.println("The BMI of the given weight "+kg+" and height "+cm+" is "+BMI);
        if(BMI<18.50){
            System.out.println("Under-Weight");
        }else if(BMI>=18.5 && BMI<=24.9){
            System.out.println("Normal");
        }else if(BMI>=25 && BMI<=29.9){
            System.out.println("Over-Weight");
        }else{
            System.out.println("Obese");
        }
    }

    public static double convert(double cm){
        double mtr=cm/100;
        return mtr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight in KG");
        double kg=sc.nextInt();
        System.out.println("Enter the height in CM");
        double cm=sc.nextInt();
        generatebmi(kg, cm);
    }
}