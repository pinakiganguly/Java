
import java.util.Scanner;

public class RegistrationDetails{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       String name,qual,email,pno,exp;
       int age;
      
       System.out.println("Enter your name:");
       name=sc.nextLine();
       System.out.println("Enter your age:");
       age=sc.nextInt();
       sc.nextLine();
       System.out.println("Enter your phoneno:");
       pno=sc.nextLine();
       System.out.println("Enter your qualification:");
       qual=sc.nextLine();
       System.out.println("Enter your email id[Please provide valid id, after registering your registration id will be mailed]:");
       email=sc.nextLine();
       System.out.println("Enter your noofexperience[if any]:");
       exp=sc.nextLine();
       //sc.nextLine();
       System.out.println("Dear "+name+","+" Thanks for registering in our portal, registration id will be mailed to "+email+" within 2 working days");
       
    }
    
}
