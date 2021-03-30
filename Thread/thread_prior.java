package Pinaki;

class clicker implements Runnable{
	int click=0;
	Thread t;
	private volatile boolean running=true;
	
	public clicker(int p) {
		t=new Thread(this);
		t.setPriority(p);
	}
	
	public void run() {
		while(running) {
			click++;
			System.out.println(click);
		}
	}
	public void stop() {
		running=false;
	}
	public void start() {
		t.start();
	}
}
public class thread_prior {
	public static void main(String args[]) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		clicker hi=new clicker(Thread.NORM_PRIORITY+2);
		clicker lo=new clicker(Thread.NORM_PRIORITY-2);
		
		lo.start();
		hi.start();
		int i=0;
		
		try {
			Thread.sleep(10000);
			//System.out.println(i++);
			//System.out.println(hi);
		}
		catch(InterruptedException e) {
			System.out.println("Main Thread interrupted");
		}
		lo.stop();
		hi.stop();
		
		try {
			hi.t.join();
			lo.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted Exception caught");
		}
		System.out.println("low-priority thread="+lo.click);
		System.out.println("High-priority thread="+hi.click);
	}
}
