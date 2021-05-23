import java.util.Scanner;

public class FindLength {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int l,flag=0;
		String str;
		str=sc.nextLine();
		l=str.length();
		for(int i=0;i<l;i++){
		    if(Character.isLetter(str.charAt(i)) || Character.isWhitespace(str.charAt(i))){
		        flag+=1;
		    }
		    else{
		        flag=0;
		        break;
		    }
		}
		if(flag!=0){
		    System.out.println("No of characters is:"+l);
		}
		else{
		    System.out.println("Invalid String");
		}
	}

}
