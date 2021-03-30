package Pinaki2;

public class thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		/*System.out.println("odd even using thread");
		  Even e=new Even();// no cpu attention
		   Odd o=new Odd();
		  // o.run();
		   //e.setPriority(6);
		  // o.setPriority(10);
		   
		   o.start();// invoke the run()...cpu attention
		   e.start();
		      }
		}
		class Even extends Thread
		{
		  public void run()
		  {  int j=2;
		    System.out.println("even....");
		    for(int i=0;i<=10;i++)
		    {j=j+2;
		      System.out.println(j);
		      
		    }
		  }
		} 
		class Odd extends Thread
		{
		  public void run()
		  {  int j=1;
		    System.out.println("odd");
		    for(int i=0;i<=10;i++)
		    {j+=2;
		      System.out.println(j);
		    
		    }*/
		Thread t=Thread.currentThread();
		System.out.println("Current thread: "+t);
		t.setName("Pinaki");
		System.out.println("After name change:"+t);
		try {
			for(int i=5;i>0;i--) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main thread interruption");
		}
		  }
		  
}
