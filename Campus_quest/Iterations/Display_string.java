import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str;
		int number;
		System.out.println("Enter the String");
		str=sc.nextLine();
		System.out.println("Enter the number");
		number=sc.nextInt();
		if(number<1){
		    System.out.println(number+" is not a valid input");
		}
		else{
		    for(int i=0;i<number;i++){
		        System.out.println(str);
		    }
		}
	}

}
