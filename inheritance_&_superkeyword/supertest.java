package Pinaki;

class Base{        //parent or super class
	Base(){
		System.out.println("Base class");
	}
	void print() {
		System.out.println("I am a base class");
	}
}

class derived extends Base{          //derived or child class
	derived(){
		System.out.println("for Derived class");
	}
	void print() {
		super.print();//access parent's print
		System.out.println("I am a derived class");
	}
}
public class supertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base obj1=new Base();
		obj1.print();
		derived obj2=new derived();
		obj2.print();// child(method overriding)
	}

}
