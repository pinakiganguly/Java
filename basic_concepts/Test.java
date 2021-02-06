package Pinaki;

/*public class Test {
	public static void main(String args[]) {
		int for=2;
		System.out.println(for);
	}

}*/
/*public class Test {
		public static void main(String [ ] ar) {
		byte b=128;
		System.out.println(b);
		}
}*/
/*public class Test {
	public static void main(String ar[]) {
		float f=1.2;
		boolean b=1;
		System.out.println(f);
		System.out.println(b);
	}
}*/

/*public class Test {
	public static void main(String ar[]) {
		double d=1.2D;
		System.out.println(d);
	}
}*/
/*public class Test {
	public static void main(String [ ] ar) {
		int a=10,b=017,c=0X3A;
		System.out.println(a+","+b+","+c);
	}
}*/
/*public class Test {
	public static void main(String [ ] args) {
		int 9A=10;
		System.out.println(9A);
	}
}*/

/*public class Test {
	public static void main(String [ ] args) {
		int x;
		System.out.println(x);
	}
}*/

/*public class Test {
	public static void main(String [ ] args) {
		int x=10;
		int y=5;
		System.out.println(++x+(++y));
	}
}*/
/*public class Test {
	public static void main(String[] args) {
		int x = 16;
		System.out.println("The original value of x is "+x);
		x = x >> 3;
		System.out.println("After using >> 3, the new value is"+x);
}
}*/

/*public class Test {
	public static void main(String[] args) {
		int x =8;
		System.out.println("The original value of x is "+x);
		x = x << 4;
		System.out.println("After using << 4, the new value is "+x);
	}
}*/

/*public class Test {
	public static void main(String args[]) {
		int i_val = 10, j_val = 20;
		boolean chk;
		chk = i_val < j_val;
		System.out.println("chk value: "+chk);
	}
}*/
public class Test{
	public static int CBSE(int x) {
		if(x<100) 
			x=CBSE(x+10);
		return(x-1);
	}
	public static void main(String args[])
	{
		System.out.println(Test.CBSE(60));
	}
}





