package Pinaki;

import java.util.Scanner;
class method
{
	int fact(int i)
	{
		if(i==0)
			return 0;
		else if(i==1)
			return 1;
		else
			return i*fact(i-1);
	}
}
class factorial
{
	public static void main(String args[])
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		x=sc.nextInt();
		method m1=new method();
		m1.fact(x);
		System.out.println("Factorial="+m1.fact(x));
	}
}
