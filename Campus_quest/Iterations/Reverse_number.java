import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        int number,n,rev=0;
        System.out.println("Enter the number=");
        number=sc.nextInt();
        while(number!=0){
            n=number%10;
            rev=rev*10+n;
            number=number/10;
        }
        System.out.println(rev);
	}

}
