import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		String str;
		str=sc.nextLine();
		int l=str.length();
		int count=0;
		for(int i=0;i<l;i++){
		    if(Character.isLetter(str.charAt(i))){
		        count+=1;
		       //System.out.println(count);
		    }
		}
		System.out.println(count);
	
	}

}
