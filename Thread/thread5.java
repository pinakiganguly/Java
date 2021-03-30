package Pinaki2; 
class T implements Runnable  //  1. create a thread implementing Runnable interface
{
  public void run()
  {System.out.println("Starting Thread");
    for(int i=1;i<=5;i++)
    System.out.println("Thread T"+i);
    System.out.println("End of Thread");
  }
}
public class thread5 {
		  public static void main(String args[])
		  {System.out.println("main start");
		    T t1=new T();  //2. To create an object for the Thread
		   
		 Thread mythread=new Thread(t1);//3. pass the object 
		    System.out.println(mythread);
		    mythread.start();
		    System.out.println("main end");
		  }
}