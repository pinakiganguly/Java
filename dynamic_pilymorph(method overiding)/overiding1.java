package Pinaki;

class fruit{
	String name;
	String taste;
	String size;
	void eat(String i,String t,String s) {
		name=i;
		taste=t;
		size=s;
		System.out.println(i+" are very "+taste+" in taste &"+size+"in size");
	}
}
class Apple extends fruit{
	void eat(String i,String t,String s) {
		System.out.println("Apples are very good in taste");
	}
}
class orange extends fruit{
	void eat(String i,String t,String s) {
		System.out.println("This orange is so delicious!");
	}
}
public class overiding1 {
	void identify(fruit f) {
		if(f instanceof Apple) {
			f.eat("Pomegranate","sweet","large");
		}
		if(f instanceof orange) {
			f.eat("Apple","bitter","small");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple ap=new Apple();
		orange o=new orange();
		overiding1 ov=new overiding1();
		ov.identify(ap);
		ov.identify(o);
		fruit f=new fruit();
		//f.eat("Pomegranate","sour","large"); this will print the parent class details
	}

}
