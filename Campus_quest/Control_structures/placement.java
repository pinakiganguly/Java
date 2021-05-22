
import java.util.Scanner;

public class Placement{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        int cs,ec,mech;
        System.out.println("Enter the no of students placed in CSE:");
        cs=sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        ec=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        mech=sc.nextInt();
        if(cs<0 || ec<0 || mech<0){
            System.out.println("Input is Invalid");
        }
        else if(cs==ec && ec==mech){
           System.out.println("None of the department has got the highest placement"); 
        }
        else if(cs==ec && mech<cs){
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("ECE");
        }
        else if(cs==mech && ec<mech){
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("MECH");
        }
        else if(ec==mech && cs<mech){
            System.out.println("Highest placement");
            System.out.println("ECE");
            System.out.println("MECH");
        }
        else if(cs>ec && cs>mech){
            System.out.println("Highest placement");
            System.out.println("CSE");
        }
        else if(ec>cs && ec>mech){
            System.out.println("Highest placement");
            System.out.println("ECE");
        }
        else if(mech>cs && mech>ec){
            System.out.println("Highest placement");
            System.out.println("MECH");
        }
        
    }
}
