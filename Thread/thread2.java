package Pinaki2;

public class thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		System.out.println("Table using thread");
		  table_3 three=new table_3();// no cpu attention
		   table_5 five=new table_5();
		   three.start();
		   five.start();
		   
		   three.setPriority(Thread.MAX_PRIORITY);
		      }
		}
		class table_3 extends Thread
		{
		  public void run()
		  {  int j=3;
		  	int r;
		    System.out.println("Table of 3");
		    for(int i=0;i<=10;i++)
		    {
		    	r=j*i;
		      System.out.println(j+"x"+i+"="+r);
		      
		    }
		  }
		} 
		class table_5 extends Thread
		{
		  public void run()
		  {  
			  int j1=5;
			  int r1;
		    System.out.println("Table of 5");
		    for(int i1=0;i1<=10;i1++)
		    {
		    	r1=j1*i1;
		      System.out.println(j1+"x"+i1+"="+r1);
		    
		    }
		  }
		  
}
