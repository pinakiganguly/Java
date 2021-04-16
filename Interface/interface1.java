package Pinaki;

interface X
{
	void show1();
}
interface Y{
	void show2();
}
class Z implements X,Y{
	public void show1() {
		System.out.println("Hello");
	}
	public void show2() {
		System.out.println("World");
	}
}
public class interface1 {
	public static void main(String args[]) {
		Z c1=new Z();
		c1.show1();
		c1.show2();
	}
}
