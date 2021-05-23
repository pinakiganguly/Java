//Mail.java code file

import java.util.Scanner;

public class Main extends Employee {
    
    public static Employee getEmployeeDetails(){
        
        Scanner sc=new Scanner(System.in);
        Employee obj=new Employee();
        System.out.println("Enter Id:");
        obj.setEmployeeId(sc.nextInt());
        System.out.println("Enter Name:");
        sc.nextLine();
        obj.setEmployeeName(sc.nextLine());
        System.out.println("Enter salary:");
        obj.setSalary(sc.nextDouble());
        return obj;
    }
    
    
    public static int getPFPercentage(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter PF percentage:");
        int val=sc.nextInt();
        return val;
    }

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code here
		
		Employee obj=new Employee();
		obj=getEmployeeDetails();
		obj.calculateNetSalary(getPFPercentage());
		System.out.println("Id: "+obj.getEmployeeId());
		System.out.println("Name: "+obj.getEmployeeName());
		System.out.println("Salary: "+obj.getSalary());
		System.out.println("Net Salary: "+obj.getNetSalary());
		
	}


}

//-------------------------------------------------------------------------------------------------------

//Employee.java code file here

public class Employee {

    // Fill the code here

    private int employeeId;
    private String employeeName;
    private double salary,netSalary;
    
    
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    
    public int getEmployeeId(){
        return employeeId;
    }
    
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }
    
    public String getEmployeeName(){
        return employeeName;
    }
    
    public void setSalary(double salary){
        this.salary=salary;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setNetSalary(double netSalary){
        this.netSalary=netSalary;
    }
    
    public double getNetSalary(){
        return this.netSalary;
    }
    
    
    public void calculateNetSalary(int pfpercentage){
        this.netSalary=this.salary - (this.salary*pfpercentage)/100;
    }
}
