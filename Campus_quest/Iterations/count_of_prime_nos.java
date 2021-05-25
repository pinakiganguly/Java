import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int start,end,count,i=0,num=0;
		System .out.println("Enter starting range");
		start=sc.nextInt();
		System.out.println("Enter ending range");
		end=sc.nextInt();
		String primeNumbers="";
		for(i=start;i<=end;i++){
		    int counter=0;
		    for(num=i;num>=1;num--){
		        if(i%num==0){
		            counter=counter+1;
		        }
		    }
		    if(counter==2){
		        primeNumbers=primeNumbers+i+" ";
		    }
		}
		String arr[]=primeNumbers.split(" ");
		System.out.println(arr.length);
	}
}
		
