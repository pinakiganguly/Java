package Pinaki;

class copy{
	int a,b;
	
	copy(int a,int b){
		this.a=a; //this current object
		this.b=b;
	}
	copy(copy c){
		a=c.a;
		b=c.b;
	}
	void show()
	{
		System.out.println("a="+a+"b="+b);
	}
}
public class copy_constructor {
	public static void main(String args[]) {
		copy obj1=new copy(10,10);
		obj1.show();
		System.out.println("obj1="+obj1);
		copy obj2=new copy(obj1);//create another reference of existing object
		System.out.println("obj2="+obj2);
		obj2.show();
		copy obj3=new copy(obj1);
		obj3=obj1;
		System.out.println("obj3="+obj3);

	}
	
}
