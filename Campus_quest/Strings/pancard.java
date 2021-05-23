import java.util.*;
 public class PanCard{
     public static void main (String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the PAN no:");
         String s1=in.nextLine();
         if(s1.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
         {
             System.out.println("Valid PAN no");
         }
         else{
             System.out.println("Invalid PAN no");
         }
     }
 }
