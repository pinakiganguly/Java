
import java.util.Scanner;

public class SnacksDetails{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        int pizza,puffs,cooldrinks,t_price;
        System.out.println("Enter the no of pizzas bought:");
        pizza=sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        puffs=sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        cooldrinks=sc.nextInt();
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizza);
        System.out.println("No of puffs:"+puffs);
        System.out.println("No of cooldrinks:"+cooldrinks);
        t_price=(pizza*100)+(puffs*20)+(cooldrinks*10);
        System.out.println("Total price="+t_price);
        System.out.println("ENJOY THE SHOW!!!");
    }
    
}
