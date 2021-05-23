import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		String str;
		int i,j;
		str=sc.nextLine();
		i=sc.nextInt();
		j=sc.nextInt();
		System.out.println(str.substring(i,j));
	}

}
