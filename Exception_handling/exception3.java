package Pinaki;

public class exception3 {
	public static void main(String args[]) {
		int d,a;
		try {
			d=0;
			a=42/d;
			System.out.println("This will not be printed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("After catch statement");
	}
}
