package Pinaki_Project;
import java.util.Scanner;
public class empl_details {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int a=Integer.parseInt(args[0]);
		String e;
			
			switch(a) {
			case 1001:
				System.out.println("Enter designation:");
				e=sc.nextLine();
				switch(e) {
				case "Engineer":
						int DA=20000,Basic=20000,HRA=8000,IT=3000;
						int sal=Basic+HRA+DA-IT;
						System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"        "+"Salary");
						System.out.println(a+"         "+"Ashis"+"          "+"R&D"+"           "+e+"         "+DA+"         "+sal);
						break;
				case "Consultant":
						int DA1=32000,Basic1=20000,HRA1=8000,IT1=3000;
						int sal1=Basic1+HRA1+DA1-IT1;
						System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"        "+"Salary");
						System.out.println(a+"         "+"Ashis"+"          "+"R&D"+"       "+e+"         "+DA1+"         "+sal1);
						break;
				case "Clerk":
						int DA2=12000,Basic2=20000,HRA2=8000,IT2=3000;
						int sal2=Basic2+HRA2+DA2-IT2;
						System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"        "+"Salary");
						System.out.println(a+"         "+"Ashis"+"          "+"R&D"+"       "+e+"         "+DA2+"         "+sal2);
						break;
				case "Receptionist":
						int DA3=15000,Basic3=20000,HRA3=8000,IT3=3000;
						int sal3=Basic3+HRA3+DA3-IT3;
						System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"         "+"DA"+"           "+"Salary");
						System.out.println(a+"         "+"Ashis"+"          "+"R&D"+"          "+e+"            "+DA3+"          "+sal3);
						break;
				case "Manager":
					int DA4=40000,Basic4=20000,HRA4=8000,IT4=3000;
					int sal4=Basic4+HRA4+DA4-IT4;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"        "+"Salary");
					System.out.println(a+"         "+"Ashis"+"          "+"R&D"+"              "+e+"           "+DA4+"         "+sal4);
					break;
				default: System.out.println("Invalid designation");
						break;
				}
				break;
			case 1002:
				System.out.println("Enter designation:");
				e=sc.nextLine();
				switch(e) {
				case "Engineer":
						int DA=20000,Basic=30000,HRA=12000,IT=9000;
						int sal=Basic+HRA+DA-IT;
						System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"     "+"Salary");
						System.out.println(a+"         "+"Sushma"+"          "+"PM"+"       "+e+"         "+DA+"        "+sal);
						break;
				case "Consultant":
					int DA1=32000,Basic1=30000,HRA1=12000,IT1=9000;
					int sal1=Basic1+HRA1+DA1-IT1;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"     "+"Salary");
					System.out.println(a+"         "+"Sushma"+"          "+"PM"+"           "+e+"         "+DA1+"       "+sal1);
					break;
				case "Clerk":
					int DA2=12000,Basic2=30000,HRA2=12000,IT2=9000;
					int sal2=Basic2+HRA2+DA2-IT2;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"     "+"Salary");
					System.out.println(a+"         "+"Sushma"+"          "+"PM"+"            "+e+"         "+DA2+"       "+sal2);
					break;
				case "Receptionist":
					int DA3=15000,Basic3=30000,HRA3=12000,IT3=9000;
					int sal3=Basic3+HRA3+DA3-IT3;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"     "+"Salary");
					System.out.println(a+"         "+"Sushma"+"          "+"PM"+"            "+e+"         "+DA3+"       "+sal3);
					break;
				case "Manager":
					int DA4=40000,Basic4=30000,HRA4=12000,IT4=9000;
					int sal4=Basic4+HRA4+DA4-IT4;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"     "+"Salary");
					System.out.println(a+"         "+"Sushma"+"          "+"PM"+"             "+e+"         "+DA4+"       "+sal4);
					break;
				default: System.out.println("Invalid designation");
						break;
				}
				break;
			case 1003:
				System.out.println("Enter designation:");
				e=sc.nextLine();
				switch(e) {
				case "Engineer":
						int DA=20000,Basic=10000,HRA=8000,IT=1000;
						int sal=Basic+HRA+DA-IT;
						System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
						System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"          "+e+"         "+DA+"       "+sal);
						break;
				case "Consultant":
					int DA1=32000,Basic1=10000,HRA1=8000,IT1=1000;
					int sal1=Basic1+HRA1+DA1-IT1;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"              "+e+"         "+DA1+"      "+sal1);
					break;
				case "Clerk":
					int DA2=12000,Basic2=10000,HRA2=8000,IT2=1000;
					int sal2=Basic2+HRA2+DA2-IT2;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"              "+e+"         "+DA2+"      "+sal2);
					break;
				case "Receptionist":
					int DA3=15000,Basic3=10000,HRA3=8000,IT3=1000;
					int sal3=Basic3+HRA3+DA3-IT3;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"              "+e+"         "+DA3+"      "+sal3);
					break;
				case "Manager":
					int DA4=40000,Basic4=10000,HRA4=8000,IT4=1000;
					int sal4=Basic4+HRA4+DA4-IT4;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"              "+e+"         "+DA4+"      "+sal4);
					break;
				default: System.out.println("Invalid designation");
						break;
				}
				break;
			case 1004:
				System.out.println("Enter designation:");
				e=sc.nextLine();
				switch(e) {
				case "Engineer":
					int DA=20000,Basic=12000,HRA=6000,IT=2000;
					int sal=Basic+HRA+DA-IT;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA+"      "+sal);
					break;
				case "Consultant":
					int DA1=32000,Basic1=12000,HRA1=6000,IT1=2000;
					int sal1=Basic1+HRA1+DA1-IT1;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA1+"      "+sal1);
					break;
				case "Clerk":
					int DA2=12000,Basic2=12000,HRA2=6000,IT2=2000;
					int sal2=Basic2+HRA2+DA2-IT2;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA2+"      "+sal2);
					break;
				case "Receptionist":
					int DA3=15000,Basic3=12000,HRA3=6000,IT3=2000;
					int sal3=Basic3+HRA3+DA3-IT3;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA3+"      "+sal3);
					break;
				case "Manager":
					int DA4=40000,Basic4=12000,HRA4=6000,IT4=2000;
					int sal4=Basic4+HRA4+DA4-IT4;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA4+"      "+sal4);
					break;
				default: System.out.println("Invalid designation");
						break;
				}
				break;
			case 1005:
				System.out.println("Enter designation:");
				e=sc.nextLine();
				switch(e) {
				case "Engineer":
					int DA=20000,Basic=50000,HRA=20000,IT=20000;
					int sal=Basic+HRA+DA-IT;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA+"      "+sal);
					break;
				case "Consultant":
					int DA1=32000,Basic1=50000,HRA1=20000,IT1=20000;
					int sal1=Basic1+HRA1+DA1-IT1;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA1+"      "+sal1);
					break;
				case "Clerk":
					int DA2=12000,Basic2=50000,HRA2=20000,IT2=20000;
					int sal2=Basic2+HRA2+DA2-IT2;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA2+"      "+sal2);
					break;
				case "Receptionist":
					int DA3=15000,Basic3=50000,HRA3=20000,IT3=20000;
					int sal3=Basic3+HRA3+DA3-IT3;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA3+"      "+sal3);
					break;
				case "Manager":
					int DA4=40000,Basic4=50000,HRA4=20000,IT4=20000;
					int sal4=Basic4+HRA4+DA4-IT4;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA4+"      "+sal4);
					break;
				default: System.out.println("Invalid designation");
						break;
				}
				break;
			case 1006: 
				System.out.println("Enter designation:");
				e=sc.nextLine();
				switch(e) {
				case "Engineer":
					int DA=20000,Basic=23000,HRA=9000,IT=4400;
					int sal=Basic+HRA+DA-IT;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA+"      "+sal);
					break;
				case "Consultant":
					int DA1=32000,Basic1=23000,HRA1=9000,IT1=4400;
					int sal1=Basic1+HRA1+DA1-IT1;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA1+"      "+sal1);
					break;
				case "Clerk":
					int DA2=12000,Basic2=23000,HRA2=9000,IT2=4400;
					int sal2=Basic2+HRA2+DA2-IT2;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA2+"      "+sal2);
					break;
				case "Receptionist":
					int DA3=15000,Basic3=23000,HRA3=9000,IT3=4400;
					int sal3=Basic3+HRA3+DA3-IT3;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA3+"      "+sal3);
					break;
				case "Manager":
					int DA4=40000,Basic4=23000,HRA4=9000,IT4=4400;
					int sal4=Basic4+HRA4+DA4-IT4;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"      "+"Salary");
					System.out.println(a+"         "+"Rahul"+"          "+"Acct"+"       "+e+"         "+DA4+"      "+sal4);
					break;
				default: System.out.println("Invalid designation");
						break;
				}
				break;
			case 1007: 
				System.out.println("Enter designation:");
				e=sc.nextLine();
				switch(e) {
				case "Engineer":
						int DA=20000,Basic=29000,HRA=12000,IT=10000;
						int sal=Basic+HRA+DA-IT;
						System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"     "+"Salary");
						System.out.println(a+"         "+"Tanmay"+"          "+"PM"+"       "+e+"         "+DA+"      "+sal);
						break;
				case "Consultant":
					int DA1=32000,Basic1=29000,HRA1=12000,IT1=10000;
					int sal1=Basic1+HRA1+DA1-IT1;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"     "+"Salary");
					System.out.println(a+"         "+"Tanmay"+"          "+"PM"+"       "+e+"         "+DA1+"      "+sal1);
					break;
				case "Clerk":
					int DA2=12000,Basic2=29000,HRA2=12000,IT2=10000;
					int sal2=Basic2+HRA2+DA2-IT2;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"     "+"Salary");
					System.out.println(a+"         "+"Tanmay"+"          "+"PM"+"       "+e+"         "+DA2+"      "+sal2);
					break;
				case "Receptionist":
					int DA3=15000,Basic3=29000,HRA3=12000,IT3=10000;
					int sal3=Basic3+HRA3+DA3-IT3;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"     "+"Salary");
					System.out.println(a+"         "+"Tanmay"+"          "+"PM"+"       "+e+"         "+DA3+"      "+sal3);
					break;
				case "Manager":
					int DA4=40000,Basic4=29000,HRA4=12000,IT4=10000;
					int sal4=Basic4+HRA4+DA4-IT4;
					System.out.println("Emp No."+"    "+"Emp Name"+"      "+"Department"+"          "+"Designation"+"     "+"DA"+"     "+"Salary");
					System.out.println(a+"         "+"Tanmay"+"          "+"PM"+"       "+e+"         "+DA4+"      "+sal4);
					break;
				default: System.out.println("Invalid designation");
						break;
				}
				break;
			default:
					System.out.println("There is no employee with empid:"+a);
					break;
			}
			sc.close();
	}
}
