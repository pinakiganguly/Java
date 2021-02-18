package Pinaki1;

class string1{
	int getCodeThroughString(String input1) {
		int sum=0,s=0,n;
		String name=input1;
		String arr[]=name.split(" ");
		int len;
		for(int i=0;i<arr.length;i++) {
			len=arr[i].length();
			sum+=len;
		}
		while(sum>0) {
			n=sum%10;
			s=s+n;
			sum=sum/10;
		}
		return s;
	}
}
public class String_code {
	public static void main(String args[]) {
		string1 str=new string1();
		System.out.println("PIN:"+str.getCodeThroughString("Pinaki Ganguly"));
	}
}
