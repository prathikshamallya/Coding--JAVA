import java.util.*;

enum units{
    ZERO(""),ONE("ONE"),TWO("TWO"),THREE("THREE"),FOUR("FOUR"),FIVE("FIVE"),
    SIX("SIX"),SEVEN("SEVEN"),EIGHT("EIGHT"),NINE("NINE");
    String value;
    units(String v){
        value=v;
    }

    String getvalue(){
        return value;
    }

}

enum tens{
    ZERO(""),TEN("TEN"),TWENTY("TWENTY"),THIRTY("THIRTY"),FOURTY("FOURTY"),FIFTY("FIFTY"),
    SIXTY("SIXTY"),SEVENTY("SEVENTY"),EIGHTY("EIGHTY"),NINTY("NINTY");

    String value;
    tens(String v){
        value=v;
    }

    String getvalue(){
        return value;
    }
}

enum teens{
    ZERO(""),ELEVEN("ELEVEN"),TWELVE("TWELVE"),THIRTEEN("THIRTEEN"),FOURTEEN("FOURTEEN"),
    FIFTEEN("FIFTEEN"),SIXTEEN("SIXTEEN"),SEVENTEEN("SEVENTEEN"),EIGHTEEN("EIGHTEEN"),NINETEEN("NINETEEN");

    String value;
    teens(String v){
        value=v;
    }

    String getvalue(){
        return value;
    }
}

enum hundreds{
    ZERO(""),ONE_HUNDRED("ONE HUNDRED"),TWO_HUNDRED("TWO HUNDRED"),THREE_HUNDRED("THREE HUNDRED"),FOUR_HUNDRED("FOUR HUNDRED"),
    FIVE_HUNDRED("FIVE HUNDRED"),SIX_HUNDRED("SIX HUNDRED"),SEVEN_HUNDRED("SEVEN HUNDRED"),EIGHT_HUNDRED("EIGHT HUNDRED"),NINE_HUNDRED("NINE HUNDRED");
    String value;
    hundreds(String v){
        value=v;
    }

    String getvalue(){
        return value;
    }
}


public class nine {



    public static String convert(int num){
        StringBuilder word=new StringBuilder();

        int t_thou=(num/10000);
        int thou=(num%10000)/1000;
        int hun=(num%1000)/100;
        int ten=(num%100)/10;
        int one=num%10;

        if(t_thou==1){
            word.append(teens.values()[thou].getvalue()).append(" THOUSANDS ");
        }else{
            if(t_thou>0&&thou>=0){
            word.append(tens.values()[t_thou].getvalue()).append(" ").append(units.values()[thou].getvalue()).append(" THOUSANDS ");
        }
        }
        
        if(t_thou<=0&&thou>0){
            word.append(units.values()[thou].getvalue()).append(" THOUSANDS ");
        }
        if(hun>0){
            word.append(hundreds.values()[hun].getvalue()).append(" ");
        }
        if(ten==1){
            word.append(teens.values()[one].getvalue()).append(" ");
        }else{
            word.append(tens.values()[ten].getvalue()).append(" ");
            if(one!=0){
                word.append(units.values()[one].getvalue()).append(" ");
            }else{
                word.append(" ");
            }
        }

        return word.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        try{
        int n=sc.nextInt();
        if(n!=0||n>99999){
            System.out.println("The converted number " +n+ " to text is: " +convert(n));
        }
        if(n<=0||n>99999){
            System.out.println("Invalid input");
                System.exit(0);
        }
    }catch(Exception arrayIndexOutOfBoundsException){
        System.out.println("Invalid input");
    }
    sc.close();
    }
}
