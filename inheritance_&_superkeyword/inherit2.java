package Pinaki;
import java.util.Scanner;
class person1{
	String name;
	String date_of_birth;
	person1(){
		}
	void display(String n, String d) {
		name=n;
		date_of_birth=d;
		System.out.println("The name of the person:"+name);
		System.out.println("The Date Of Birth of the person is "+date_of_birth);
		}
		
		
}
class teacher extends person1{
	int salary;
	String subject;
	teacher(){
		super();
	}
		void display(int s, String sub) {
			salary=s;
			subject=sub;
			System.out.println("The salary of the teacher=Rs. "+salary);
			System.out.println("The subject taught by the teacher is "+subject);
	}
}
class student extends person1{
	int student_id;
	student(){
		super();
	}
		void display(int id) {
			student_id=id;
			System.out.println("The student id of the person= "+student_id);
	}
}
class college_student extends student{
	String college_name;
	int year;
	college_student(){
		super();
	}
	void display(String cn, int yr) {
		college_name=cn;
		year=yr;
		System.out.println("The College name of the student: "+college_name);
		System.out.println("The Year of the Student: "+year);
	}
}
public class inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n,d,sub,ce;
		int sal,si,y;
		System.out.println("Enter the name of the student: ");
		n=sc.nextLine();
		System.out.println("Enter the date of birth of the student: ");
		d=sc.nextLine();
		person1 obj=new person1();  //object of class person1 i.e, the parent class is created and invoking its members
		obj.display(n, d);
		System.out.println("---------------------------------------");
		System.out.println("Enter the salary of the teacher: ");
		sal=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the subject taught ny the teacher: ");
		sub=sc.nextLine();
		teacher obj2=new teacher();  //object of second class teacher i.e, the child class of person1 is created and invoking its members
		obj2.display(sal, sub);
		System.out.println("-------------------------------------");
		System.out.println("Enter the student id: ");
		si=sc.nextInt();
		student obj3=new student();  //object of class student i.e, the child class of person1 is created and invoking its members
		sc.nextLine();
		obj3.display(si);
		System.out.println("----------------------------------------");
		System.out.println("Enter the college name of the student: ");
		ce=sc.nextLine();
		System.out.println("Enter the year of the student reading: ");
		y=sc.nextInt();
		college_student obj4=new college_student();  //object of class college_student i.e, the child class of student is created and invoking its members
		obj4.display(ce,y);
		sc.close();
		

	}

}
