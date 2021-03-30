package Pinaki2;
/*class NewThread implements Runnable {
	Thread t;
	
	NewThread(){
		t=new Thread(this, "Demo Thread");
		System.out.println("Child Thread:"+t);
		t.start();
	}
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Child Thread:"+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Child interrupted");
		}
		System.out.println("Exiting child thread");
	}
}
public class thread6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread();
		try {
			for(int i=6;i>0;i--) {
				System.out.println("Main Thread:"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread exiting");
	}

}
*/

//extending thread

class NewThread extends Thread{
	NewThread(String ThreadName){
		super("Demo Thread");
		System.out.println("Child Thread:"+this);
		start();
	}
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Child Thread:"+i);
				Thread.sleep(500);
			}}
		catch(InterruptedException e) {
			System.out.println("Child Interrupted");
		}
		System.out.println("Exiting child thead");
	}
}

public class thread6{
	public static void main(String args[]) {
		new NewThread("one");
		new NewThread("two");
		new NewThread("three");
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}







