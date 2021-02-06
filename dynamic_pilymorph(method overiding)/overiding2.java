package Pinaki;
class shape{
	void draw() {
		System.out.println("Drawing shape");
	}
	void erase() {
		System.out.println("Erasing shape");
	}
}

class Circle extends shape{
	void draw() {
		System.out.println("Drawing circle");
	}
	void erase() {
		System.out.println("Erasing circle");
	}
}
class Triangle extends shape{
	void draw() {
		System.out.println("Drawing triangle");
	}
	void erase() {
		System.out.println("Erasing triangle");
	}
}
class Square1 extends shape{
	void draw() {
		System.out.println("Drawing circle");
	}
	void erase() {
		System.out.println("Erassing square");
	}
}
public class overiding2 {
	void identify(shape sh) {
		if(sh instanceof Circle) {
			sh.draw();
			sh.erase();
		}
		if(sh instanceof Triangle) {
			sh.draw();
			sh.erase();
		}
		if(sh instanceof Square1) {
			sh.draw();
			sh.erase();
		}
	}
	public static void main(String args[]) {
		shape c=new Circle();
		shape t=new Triangle();
		shape s=new Square1();
		overiding2 ov=new overiding2();
		ov.identify(c);
		ov.identify(t);
		ov.identify(s);
	}
	
	
}

