import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//String months,days;
		String month[]={"1.January","2.February","3.March","4.April","5.May","6.June","7.July","8.August","9.September","10.October","11.November","12.December"};
		String days[]={"1.Monday","2.Tuesday","3.Wednesday","4.Thursday","5.Friday","6.Saturday","7.Sunday"};
		while(true){
		    System.out.println("1.Display the Months");
		   // months=sc.nextLine();
		    System.out.println("2.Display the Days");
		    //days=sc.nextLine();
		    System.out.println("3.Exit");
		    int option;
		    option=sc.nextInt();
		    switch(option){
		        case 1:for(int i=0;i<month.length;i++){
		            System.out.println(month[i]);
		        } 
		        break;
		        case 2:for(int i=0;i<days.length;i++){
		            System.out.println(days[i]);
		        }
		        break;
		        case 3: return;
		        
		    }
		    
		}
	}

}
