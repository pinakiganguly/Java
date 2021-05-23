import java.util.Scanner;

public class Count {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		String str;
		int count=0,flag=0;
		String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		System.out.println("Enter your name:");
		str=sc.nextLine();
		int l=str.length();
		for(int i=0;i<l;i++){
		    char ch=str.charAt(i);
		    if(Character.isLetter(str.charAt(i)) || Character.isWhitespace(str.charAt(i))){
		        count+=1;
		        flag+=1;
		    }
		    else if(specialCharactersString.contains(Character.toString(ch))){
		        flag=0;
		        break;
		    }
		    else{
		        flag=0;
		    }
		}
		if(flag!=0){
		    System.out.println(str+" has "+count+" characters");
		}
		else{
		    System.out.println("Invalid input");
		}
	}

}
