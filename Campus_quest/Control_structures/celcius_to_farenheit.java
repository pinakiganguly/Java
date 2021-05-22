
import java.util.Scanner;

public class CelsiusConversion{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
       double C,F;
       C=sc.nextDouble();
       F=((9*C)/5)+32;
       System.out.printf("%.1f%n",F);
       
    }
    
}
