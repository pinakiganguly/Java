package Pinaki;
class notEqualException extends Exception
{
	//IllegalMarkException(String msg)
	//{
		//super(msg);//calling super class constructor
	//}
	
}


class Test10
{
	double number;
	Test10(double n)
	{
		number=n;
	}
	void display() throws notEqualException
	{
		if(number!=3.14) throw new notEqualException();
		
		System.out.println("number="+number);
	}

	}
public class throws3 {
	public static void main(String args[]) {
		Test10 t=new Test10(3.12);
		try
		{
			t.display();
		}
		catch(notEqualException e)
		{
			System.out.println("caught in main");
		}
		
		
	}
}
