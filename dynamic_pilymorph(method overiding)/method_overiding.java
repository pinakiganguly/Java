package Pinaki;
class collegestudent{   //dynamic polymorphism
	void print(int i) {   //method overriding
		System.out.println("I am a student");
	}
}
class Firstyear extends collegestudent{
	void print(int i) {
		System.out.println("I am a student of first year");
	}
}
class Thirdyear extends collegestudent{
	void print(int i) {
		System.out.println("I am a student of third year");
	}
}


public class method_overiding {
	void identify(collegestudent stu) {    //instance variable
		if(stu instanceof Firstyear) {   //stu is an object of first year
			stu.print(1);
			System.out.println("Play cricket");
		}
		if(stu instanceof Thirdyear) {
			stu.print(2);
			System.out.println("Play football");
		}
	}
	
	public static void main(String args[]) {
		Firstyear stu1=new Firstyear();
		Thirdyear stu2=new Thirdyear();
		method_overiding id=new method_overiding();
		id.identify(stu1);
		id.identify(stu2);
		
	}
}
