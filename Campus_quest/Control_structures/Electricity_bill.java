
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        double usage;
        double f;
        System.out.println("Enter the units consumed");
        usage=sc.nextDouble();
        if(usage<=20){
            System.out.println("No charge");
        }
        else if(usage>20 && usage<=100){
            f=usage*3.50;
            System.out.println("You have to pay Rs."+f);
        }
        else{
            f=usage*5.00;
            System.out.println("You have to pay Rs."+f);
        }
    }
    
}
