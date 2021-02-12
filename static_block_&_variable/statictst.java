package Pinaki;

class student1{
	int roll;//instance variable
	String name;
	static String college_name="HIT";//class variable all the objects of the class will share this value.
	student1(int r,String n){
		roll=r;
		name=n;
	}
	void display(){
		System.out.println(roll+" "+name+" "+college_name);
	}
}
public class statictst {
	public static void main(String args[]) {
		student1 s1=new student1(1,"Pinaki");
		System.out.println(s1.name);
		System.out.println(student1.college_name);//this is the right way, we have to call the static variable we have to access by using class name.
		s1.display();
	}
}
