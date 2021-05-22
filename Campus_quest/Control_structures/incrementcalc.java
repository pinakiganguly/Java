
import java.util.Scanner;

public class IncrementCalculation{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        float app_rat;
        int sal;
        System.out.println("Enter the salary");
        sal=sc.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        app_rat=sc.nextFloat();
        if(sal<=0 || app_rat>5 || app_rat<=0){
            System.out.println("Invalid input");
        }
        else if(app_rat>=1 && app_rat<=3){
            sal+=sal*10/100;
            System.out.println(sal);
        }
        else if(app_rat>=3.1 && app_rat<=4){
            sal+=sal*25/100;
            System.out.println(sal);
        }
        else if(app_rat>=4.1 && app_rat<=5){
            sal+=sal*30/100;
            System.out.println(sal);
        }
    }
    
}
