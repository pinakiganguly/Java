
package Pinaki;

class animal{
	void eat() {
		System.out.println("Lion is carnivorous!");
	}
	void sleep() {
		System.out.println("Hippos sleep a lot!");
	}
}
class bird extends animal{
	void fly() {
		System.out.println("Birds can fly.");
	}
	void eat() {
		System.out.println("Birds are basically omnivorous.");
	}
	void sleep() {
		System.out.println("Most of the birds sleep at night.");
	}
}
public class inherit1{
	public static void main(String args[]){
		// TODO Auto-generated method stub	
		animal a=new animal();
		a.eat();
		a.sleep();
		bird b=new bird();
		b.fly();
		b.eat();
		b.sleep();
	}
}
