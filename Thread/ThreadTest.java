package Pinaki2;

/*public class ThreadTest {
	 public static void main(String args[])
	  { 
	    System.out.println("Main begin");
	    System.out.println("goto other threads");
	    First f=new First();
	    f.setName("India");
	    System.out.println(f.getName());   // India
	    f.setPriority(Thread.MIN_PRIORITY); // 1
	     Second s=new Second();
	     s.setPriority(Thread.MAX_PRIORITY);  // 10 
	     f.start();//start First thread or call run*/
	    
	 //  f.start();//start First thread or call run
	   /* s.start();//start second
	} }
	class First extends Thread
	{
	  public void run()
	  {
	    for(int i=1;i<=3;i++)
	      System.out.println("first i"+i);
	    System.out.println("first thread over");
	  }
	}
	    
	    class Second extends Thread
	{
	  public void run()
	  {
	    for(int j=1;j<=3;j++)
	      System.out.println("second j"+j);
	    System.out.println("second thread over");
	  }
	  
	  
}*/


public class ThreadTest
{ 
  public static void main(String args[])
  { 
    System.out.println("Main begin");
    System.out.println("goto other threads");
    First f=new First();
    f.setName("India");
    System.out.println(f.getName());   // India
    f.setPriority(Thread.MIN_PRIORITY); // 1
    Second s=new Second();
    s.setPriority(Thread.MAX_PRIORITY);  // 10 
    f.start();//start First thread or call run*/
   // f.start();//start First thread or call run
    s.start();//start second
  }
 
}
class First extends Thread
{
  public void run()
  {
    for(int i=1;i<=3;i++)
      System.out.println("first i"+i);
    System.out.println("first thread over");
  }
}
    
class Second extends Thread
{
  public void run()
  {
    for(int j=1;j<=3;j++)
      System.out.println("second j"+j);
    System.out.println("second thread over");
  }
}