package Pinaki2;
class even1 extends Thread{
	public void run() {
		int i;
		System.out.println("The even numbers from 1 to 20 : ");
		for(i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
class odd1 extends Thread{
	public void run() {
		int i;
		System.out.println("The odd numbers between 1 to 20 : ");
		for(i=1;i<=20;i++) {
			 if(i%2!=0) {
				 System.out.println(i);
			 }
			
		}
	}
}
public class thread_ass4 {
	public static void main(String args[]) {
		even1 e1=new even1();
		odd1 o=new odd1();
		//o.start();
		e1.start();
		try {
			e1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		o.start();
	}
}
