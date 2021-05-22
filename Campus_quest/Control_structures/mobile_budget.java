
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       int budget;
       System.out.println("Enter the cost of the mobile");
       budget=sc.nextInt();
       if(budget<=13000){
           System.out.println("Mobile chosen is within the budget");
       }
       else{
           System.out.println("Mobile chosen is beyond the budget");
       }
       
    }
    
}
