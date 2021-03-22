package Pinaki;

public class throws2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			 
		    try{
		    	demoproc();
		    }
		 
		    catch(Exception e)
		    {
		    	System.out.println("inside main..");
		    }
		    
		    
		 }
		static void demoproc() throws IllegalAccessException
		 {
		  try{
		    
		  throw new IllegalAccessException("abc");
		 }

		catch(IllegalAccessException e)
		 { 
		   System.out.println("Illegal");
		throw e; 
		}

	}

	}
