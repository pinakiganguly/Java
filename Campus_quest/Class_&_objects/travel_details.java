//testmain.java code file
import java.util.Scanner;

public class TestMain {
    
    
    public static BusTicket getTicketDetails(){
        Scanner sc=new Scanner(System.in);
        BusTicket obj=new BusTicket();
        System.out.println("Enter the ticket no:");
        obj.setTicketNo(sc.nextInt());
        System.out.println("Enter the ticket price:");
        obj.setTicketPrice(sc.nextFloat());
        
        return obj;
    }

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code here
		
		Person obj1=new Person();
// 		BusTicket obj;
		System.out.println("Enter the passenger name:");
		obj1.setName(sc.nextLine());
		System.out.println("Enter the gender(M or F/ m or f):");
		obj1.setGender(sc.next().charAt(0));
		System.out.println("Enter the age:");
		obj1.setAge(sc.nextInt());
		BusTicket obj= getTicketDetails();
		obj.setPerson(obj1);
		obj1=obj.getPerson();
		System.out.println("Ticket no:"+obj.getTicketNo());
		System.out.println("Passenger Name:"+obj1.getName());
        System.out.println("Price of a ticket : "+obj.getTicketPrice());
        obj.calculateTotal();
        System.out.println("Total Amount : "+obj.getTotalAmount());
	}

}


//-------------------------------------------------------------------------------------------

//BusTicket.java code file 

public class BusTicket {
    
    	// Fill the code here
    	
    	
    	private int ticketNo;
    	private float ticketPrice,totalAmount;
    	private Person person;
    // 	int age=person.getAge();
    // 	char gender=person.getGender();
    	
    	public void setTicketNo(int ticketNo){
    	    this.ticketNo=ticketNo;
    	}
    	
    	public void setTicketPrice(float ticketPrice){
    	    this.ticketPrice=ticketPrice;
    	}
    	
    	public void setTotalAmount(float totalAmount){
    	    this.totalAmount=totalAmount;
    	}
    	
    	public void setPerson(Person person){
    	    this.person=person;
    	}
    	
    	public void calculateTotal(){
    	    if(person.getAge()<=15){
    	        
    	        setTotalAmount(ticketPrice/2);
    	    }
    	    
    	    else if(person.getAge()>=60){
    	        
    	        setTotalAmount(ticketPrice*75/100);
    	    }
    	    
    	    else if (person.getGender()=='f' || person.getGender()=='F'){
    	        
    	        setTotalAmount(ticketPrice*90/100);
    	    } 
    	    
    	    else{
    	        setTotalAmount(ticketPrice);
    	    }

    	}
    	
    	
    	public int getTicketNo(){
    	    return this.ticketNo;
    	}
    	
    	public float getTicketPrice(){
    	    return this.ticketPrice;
    	}
    	
    	public float getTotalAmount(){
    	    return this.totalAmount;
    	}
    	
    	public Person getPerson(){
    	    return person;
    	}
	}

//--------------------------------------------------------------------------------

//Person.java code file

public class Person {
    
    	// Fill the code here
    	
    	
    	private String name;
    	private char gender;
    	private int age;
    	
    	
    	public void setName(String name){
    	    this.name=name;
    	}
    	
    	public void setGender(char gender){
    	    this.gender=gender;
    	}
    	
    	public void setAge(int age){
    	    this.age=age;
    	}
    	
    	public String getName(){
    	    return this.name;
    	}
    	
    	public char getGender(){
    	    return this.gender;
    	}
    	
    	
    	public int getAge(){
    	    return this.age;
    	}
	}
