package Pinaki;

public class staticblock{
	staticblock(){
		System.out.println("Within constructor");
	}
	static {
		System.out.println("Within 1st static block ");
	}
	static void m1() {
		System.out.println("Within static m1 method");
	}
	static {
		System.out.println("Within 2nd static block");
		m1();
	}

//public class staticblock {
	public static void main(String args[]) {
		System.out.println("Within main");
			staticblock x = new staticblock();
		}
		static {
			System.out.println("Within 3rd static block");
		}
}



