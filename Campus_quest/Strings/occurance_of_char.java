import java.util.Scanner;

public class OccurrenceOfChar {
    static boolean checkAlpha(char c){
        
        if(Character.isAlphabetic(c)){
            return true;
        }
        return false;
    }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter a word:");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++){
		    if(!checkAlpha(str.charAt(i)) || str.charAt(i)==' '){
		        System.out.println("Not a valid string");
		        System.exit(0);
		    }
		}
		System.out.println("Enter the character:");
		char c = sc.next().charAt(0);
		if(!checkAlpha(c)){
		    System.out.println("Given character is not an alphabet");
		    System.exit(0);
		}
		char ch[] = str.toCharArray();
		int t =0;
		for(char p:ch){
		    if(p==c)
		    t++;
		}
		if(t==0)
		System.out.println("The given character '"+c+"' not present in the given word.");
		else
		System.out.println("No of '"+c+"' present in the given word is "+t+".");
		
		
	}

}
