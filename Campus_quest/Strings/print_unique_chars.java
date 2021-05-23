import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		int a=-1,b=-1;
		System.out.println("Enter the sentence:");
		String str=sc.nextLine();
		StringBuilder str1=new StringBuilder();
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)>64 || str.charAt(i)==' '){
		        a=str.indexOf(str.charAt(i));
		        b=str.lastIndexOf(str.charAt(i));
		        if(a==b){
		            str1.append(str.charAt(i));
		        }
		        else
		            continue;
		    }
		    else{
		        System.out.println("Invalid Sentence");
		        System.exit(0);
		    }
		}
		
		if(str1.length()==0){
		    System.out.println("No Unique characters");
		    System.exit(0);
		}
		else{
    		System.out.println("Unique characters:");
    		for(int i=0;i<str1.length();i++){
    		    if(str1.charAt(i)>64){
    		        System.out.println(str1.charAt(i));
    		    }
    		}
		}
	}
}
