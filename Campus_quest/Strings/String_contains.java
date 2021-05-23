import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		String str,str1;
		str=sc.nextLine();
		str1=sc.nextLine();
		if(str.contains(str1)){
		    System.out.println(str1+" is contained in a sentence");
		}
		else{
		    System.out.println(str1+" is not contained in a sentence");
		}
		
	}

}
