package Pinaki;

public class exception6 {
	public static void main(String args[]) {
		try {
			String s="Hi";
			String name="XYZ";
			System.out.println(s.length());
			int n=Integer.parseInt(name);//converting string to integer
			System.out.println(n);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
