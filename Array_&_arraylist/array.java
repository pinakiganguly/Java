package Pinaki;

public class array {
	public static void main(String args[]) {
		int c[]= {1,4,2,5,0};
		int sumOfArray=0;
		int a=c.length;
		int sumofAll=a*(a+1)/2;
		for(int i=0;i<a;i++) {
			sumOfArray=sumOfArray+c[i];
		}
		int missingNumber=sumofAll-sumOfArray;
		System.out.println("The missing no.="+missingNumber);
	}
}
