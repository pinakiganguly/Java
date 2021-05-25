import java.util.Scanner;
public class Factorial {
    static int fact(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
    return fac;
    }


	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter the size of an array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++){
		    
		    if(arr[i]>0 && arr[i]<10)
		        sum=sum+fact(arr[i]);
		}
// 		System.out.println(sum);
		if(sum==0){
		    System.out.println("No positive and single digit numbers found in an array");
		}
		else
		    System.out.println(sum);
	}

}
