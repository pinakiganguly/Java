import java.util.Scanner;

public class FindFactor {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int number,n1;
		number=sc.nextInt();
		if(number<0){
		    n1=Math.abs(number);
		for(int i=1;i<=n1;i++){
		    if(n1%i==0){
		        System.out.print(i+", ");
		    }
		}}
		 else if(number==0){
		     System.out.println("No Factors");
		 }
		 else{
		     for(int i=1;i<=number;i++){
		    if(number%i==0){
		        System.out.print(i+", ");
		    }
		}
		     
		 }
	}

}
