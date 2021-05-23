import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		String str1;
		String str2;
		str1=sc.nextLine();
		str2=sc.nextLine();
		if(str1.equals(str2)){
		    System.out.println("Case sensitive");
		}
		else if(str1.equalsIgnoreCase(str2)){
		    System.out.println("Case insensitive");
		}
		else{
		    System.out.println("Not equal");
		}
	}

}
