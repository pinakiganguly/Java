import java.util.Scanner;

public class Sum {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter the size of an array:");
		int n = sc.nextInt();
		if (n<=0){
		    System.out.println("Invalid Array Size");
		    System.exit(0);
		}
		int ar[] = new int[n];
		System.out.println("Enter the elements:");
		int max=0,min=0;
		for(int i=0;i<n;i++){
		    ar[i] = sc.nextInt();
		    if(i==0){
		        max = ar[i];
		        min = ar[i];
		    }
		    else{
		    
		    if(ar[i]<min)
		        min = ar[i];
		    if(ar[i]>max)
		        max=ar[i];}
		}
		int s = max+min;
		System.out.println(s);
		
		
	}
}
