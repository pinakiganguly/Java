package Pinaki1;
import java.util.Scanner;
class simpleGetterSetter {

	private String number;
	
	public String getNumber()
	{
		return this.number;
	}
	
	public void setNumber(String n)
	{
		this.number=n;
	}
	
	
}//class
public class Gettersetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 simpleGetterSetter obj=new simpleGetterSetter();
		 // obj.number=10;// invalid 
	  
	  //int num=obj.number;// invalid
		 System.out.println("Enter the no.:");
		 String n=sc.nextLine();
	  	  
	 obj.setNumber(n);
	  String num=obj.getNumber();
	  System.out.println(num);
	  

	}

}
