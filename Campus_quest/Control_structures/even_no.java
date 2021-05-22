
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       int number;
        System.out.println("Enter the number");
        number=sc.nextInt();
        if(number%2==0){
            System.out.println(number+" is an even number");
        }
        
    }
    
}
