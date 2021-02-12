package Pinaki;
import java.util.Scanner;
class Person{
	String name;
	Person() {
	}
	void getName(String n1) {
		name=n1;
		System.out.println("Name of the employee is "+name);
	}
}
class Employee5 extends Person{
	String national_insurance_no;
	double salary;
	int year;
	Employee5(){
		super();
		System.out.println("Employee details!");
	}
	void get_insuranceNo(String no) {
		national_insurance_no=no;
		System.out.println("The national insurance no. is="+national_insurance_no);
	}
	void getSalary(double sal) {
		salary=sal;
		System.out.println("The salary of the employee= Rs. "+salary);
	}
	void getYearofjoin(int yr) {
		year=yr;		
		System.out.println("The year of joining of employee="+year);
	}
}
public class emp{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String n1,no;
		double sal1;
		int y;
		System.out.println("Enter the Name of the employee:");
		n1=sc.nextLine();
		System.out.println("Enter the inusrance no. of the employee=");
		no=sc.nextLine();
		System.out.println("Enter the salary of the employee= Rs.");
		sal1=sc.nextDouble();
		System.out.println("Enter the year of joining of Employee=");
		y=sc.nextInt();
		Employee5 obj=new Employee5();
		obj.getName(n1);
		obj.get_insuranceNo(no);
		obj.getSalary(sal1);
		obj.getYearofjoin(y);
		sc.close();
	}
}