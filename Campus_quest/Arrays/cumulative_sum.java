import java.util.Scanner;

public class CumulativeSum {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		int n,sum=0;
		int [] arr=new int[20];
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		if(n>0){
		    System.out.println("Enter the elements");
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int m=arr[0];
		    for(int i=0;i<n;i++){
		        sum+=arr[i];
		        System.out.print(sum+" ");
		        arr[i]=sum;
		        
		    }
		}
		else{
		    System.out.println("Invalid range");
		}
	}

}
