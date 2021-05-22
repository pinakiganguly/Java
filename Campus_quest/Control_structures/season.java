
import java.util.Scanner;

public class Season{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
      int m; 
      System.out.println("Enter the month:");
      m=sc.nextInt();
      switch(m){
          case 1: System.out.println("Season:Winter");
                    break;
          case 2: System.out.println("Season:Winter");
                    break;
          case 3: System.out.println("Season:Spring");
                    break;
          case 4: System.out.println("Season:Spring");
                    break;
          case 5: System.out.println("Season:Spring");
                    break;
          case 6: System.out.println("Season:Summer");
                    break;
          case 7: System.out.println("Season:Summer");
                    break;
          case 8: System.out.println("Season:Summer");
                    break;
          case 9: System.out.println("Season:Autumn");
                    break;
          case 10: System.out.println("Season:Autumn");
                    break;
          case 11: System.out.println("Season:Autumn");
                    break;
          case 12: System.out.println("Season:Winter");
                    break;
          default: System.out.println("Invalid month");
                    break;
      }
    }
    
}
