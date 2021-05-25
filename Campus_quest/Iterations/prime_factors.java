import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number=sc.nextInt();
		for(int i=2;i<number;i++){
		    while(number%i==0){
		        System.out.print(i+" ");
		        number=number/i;
		    }
		}
		if(number>2){
		    System.out.println(number);
		}
	}

}
