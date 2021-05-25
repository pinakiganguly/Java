import java.util.Scanner;

public class Power {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int base,exponent;
		System.out.println("Enter the number");
		base=sc.nextInt();
		System.out.println("Enter the digit");
		exponent=sc.nextInt();
		long result=1;
		if(base<0 || exponent<0){
		    System.out.println("Invalid input");
		}
		else{
		    while(exponent!=0){
		        result*=base;
		        --exponent;
		    }
		System.out.println(result);
		}
		
	}

}
