import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		int start,end,r,num1=0,num2=0;
		System.out.println("Enter the starting range");
		start=sc.nextInt();
		System.out.println("Enter the ending range");
		end=sc.nextInt();
		for(int i=start;i<end;i++){
		    num1=i;
		    num2=0;
		    while(num1!=0){
		        r=num1%10;
		        num2=(num2*10)+r;
		        num1=num1/10;
		    }
		    //count=0;
		    if(i==num2){
		        System.out.print(i+" ");
		    }
		}
		
	}

}
