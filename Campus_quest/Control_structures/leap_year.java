
import java.util.Scanner;

public class LeapYear{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //String year;
        int l,year;
        System.out.println("Enter the year");
        year=sc.nextInt();
        String y=Integer.toString(year);
        l=y.length();
        if(l==4){
            if((year%4==0 && year%100!=0) || (year%400==0)){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        }
        else{
            System.out.println("Invalid Year");
        }
    }
    
}
