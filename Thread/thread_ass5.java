package Pinaki2;
class thread_1 extends Thread{
	public void run() {
		System.out.println("This is the first thread");
		
	}
}
class thread_2 extends Thread{
	public void run() {
		System.out.println("This is the second thread");
	}
}
class thread_3 extends Thread{
	public void run() {
		System.out.println("This is the third thread");
	}
}
public class thread_ass5 {
	public static void main(String args[]) {
		thread_1 t1=new thread_1();
		thread_2 t2=new thread_2();
		thread_3 t3=new thread_3();
		t1.start();
		t2.start();
		t3.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
	}
}
