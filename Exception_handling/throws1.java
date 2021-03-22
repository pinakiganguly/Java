package Pinaki;

public class throws1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    try
		    {
		    	demoproc();
		    }
		    catch(IllegalAccessException e)
		    { 
		    	System.out.println("illegal");
		    }
		 
		 }//main

		  static void demoproc() throws IllegalAccessException
		 {
		 
		    
		    throw new IllegalAccessException("abc");


		  }
		
	}


