import java.util.Scanner;

public class Customer {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String name,gender,hailing_from;
		int age;
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter age:");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter gender:");
		gender=sc.nextLine();
		System.out.println("Hailing from:");
		hailing_from=sc.nextLine();
		System.out.println("Welcome, "+name+"\n"+"Age:"+age+"\n"+"Gender:"+gender+"\n"+"City:"+hailing_from);
	}

}
