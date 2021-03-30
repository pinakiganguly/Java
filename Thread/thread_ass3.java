package Pinaki2;
class delay extends Thread{
	public void run() {
		int i;
		try {
			for(i=1;i<=10;i++) {
				System.out.println(i);
				if(i==5) 
					Thread.sleep(5000);
			}
		}
		catch(Exception e) {
			
		}
	}
}
public class thread_ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		delay d=new delay();
		d.start();
		try {
			d.notify();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
