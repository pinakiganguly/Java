import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
	    int number,rev=0,n,no;
	    number=sc.nextInt();
	    no=number;
	    if(number>=0){
	        while(number!=0){
	            n=number%10;
	            rev=(rev*10)+n;
	            number/=10;
	        }
	        if(no==rev){
	            System.out.println("Palindrome");
	        }
	        else{
	            System.out.println("Not a Palindrome");
	        }
	    }
	    else{
	        System.out.println("Invalid Input");
	    }
	}

}
