package Pinaki2;
class Scooby extends Thread{
	public void run() {
		System.out.println("Shaggy");
	}
}
class Shaggy extends Thread{
	public void run() {
		System.out.println("Scooby");
	}
}
public class thread_ass1 {
	public static void main(String args[]) {
		Scooby s1=new Scooby();
		Shaggy s2=new Shaggy();
		s1.start();
		s2.start();
	}
}
