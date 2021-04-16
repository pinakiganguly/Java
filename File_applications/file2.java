package Pinaki;
import java.io.*;
public class file2 
{
	public static void main(String args[])
	{
		byte[] buf = {75,66,37,38};
		ByteArrayInputStream byt = new ByteArrayInputStream(buf);
		int k = 0;
		System.out.println();
		while((k = byt.read()) != -1)
		{
			char ch = (char) k;
			System.out.println("ASCII Value Of The Character Is : " + k + " ; Special Character Is : " + ch);
		}
		System.out.print("\n");
	}
}