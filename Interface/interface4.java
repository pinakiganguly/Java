package Pinaki;

interface one{
	void print1();
	void print2();
}
interface two{
	void print3();
}
class T implements two{
	public void print1() {
		System.out.println("From 1");
	}
	public void print2() {
		System.out.println("From 2");
	}
	public void print3() {
		System.out.println("From 3");
	}
}
public class interface4 {
	public static void main(String args[]) {
		T obj=new T();
		obj.print1();
		obj.print2();
		obj.print3();
	}

}
