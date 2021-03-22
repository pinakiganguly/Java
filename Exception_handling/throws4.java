package Pinaki;

class exceedInternalException extends Exception
{
	//IllegalMarkException(String msg)
	//{
		//super(msg);//calling super class constructor
	//}
	
}
class exceedExternalException extends Exception{
	
}

class Test11
{
	int i_marks,e_marks;
	Test11(int n,int n1)
	{
		i_marks=n;
		e_marks=n1;
	}
	void display() throws exceedInternalException
	{
		if(i_marks>40) throw new exceedInternalException();
		
		System.out.println("internal marks="+i_marks);
	}
	void display1() throws exceedExternalException {
		if(e_marks>60) throw new exceedExternalException();
		System.out.println("External marks="+e_marks);
	}

	}
public class throws4 {
	public static void main(String args[]) {
		Test11 t=new Test11(40,70);
		try
		{
			t.display();
		}
		catch(exceedInternalException e)
		{
			System.out.println("Internal marks exceeded");
			System.out.println("External marks exceeded");
		}
		try {
			t.display1();
		}
		catch(exceedExternalException e) {
			System.out.println("External marks exceeded");
		}
		
	}
}

