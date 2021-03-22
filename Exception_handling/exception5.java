package Pinaki;

public class exception5 {
	public static void main(String s[])
	  {
	    int no[]={1,2,3};
	    int a=10;
	   
	    try
	    { a=a/1;  //1  throw arithmetic exception
	      
	      System.out.println(no[2]);//2
	    }
	      
	  /* catch(Exception e)
	    {  
	    System.out.println(e);
	    }
	    */
	catch(ArrayIndexOutOfBoundsException e)
	    {
	      System.out.println("out of range");
	    }
	       
	     catch(ArithmeticException e)
	     {
	      System.out.println("div by zero");
	    }
	    
	    
	  }//main()
	  

} //trycatch
	    