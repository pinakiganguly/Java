import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		//String[] str=new String[20];
		String split_char;
		String str;
		str=sc.nextLine();
		split_char=sc.nextLine();
	    String[] str1=str.split(split_char);
		for(int i=0;i<str1.length;i++){
		    System.out.println(str1[i]);
		}
	}

}
