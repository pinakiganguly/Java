import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		String str;
		str=sc.nextLine();
		int l=str.length();
		if(l%2==0){
		    System.out.println(l+" Even");
		}
		else{
		    System.out.println(l+" Odd");
		}
	}

}
