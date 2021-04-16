package Pinaki;

/*final*/ interface A1{   //final will prevent overriding.
	void meth1();
	void meth();
}
interface B1 extends A1{
	void meth3();
}
interface D1 {
	void meth4();
}
class MyClass implements B1,D1{
	public void meth1() {
		System.out.println("Implement meth1().");
	}
	public void meth2() {
		System.out.println("Implement meth2().");
	}
	public void meth3() {
		System.out.println("Implement meth3().");
	}
	public void meth4() {
		System.out.println("Implement meth4().");
	}
}
public class interface2 {
	public static void main(String args[]) {
		MyClass obj=new MyClass();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
	}
}
