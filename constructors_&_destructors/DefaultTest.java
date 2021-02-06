package Pinaki;

 class Default1 {
	int i;   //instance variable
	double d;
	boolean b;
	Default1(int ii,double dd,boolean bb)//parameterized constructor
	{
		i=ii;
		d=dd;
		b=bb;
	}
	Default1() //no argument constructor
	{
		i=0;
		d=3.4;
		b=false;
	}
	void display() {
		System.out.println("i="+i+" "+"d="+d+" "+"b="+b);
	}

}
public class DefaultTest{
	public static void main(String args[])
	{
		Default1 obj= new Default1(1,0.5,true);
		Default1 obj1= new Default1();
		obj.display();
		obj1.display();
	}
	
}



