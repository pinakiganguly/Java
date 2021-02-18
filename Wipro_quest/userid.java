package Pinaki1;
class useridGeneration{
	void find(String input1,String input2,int input3,int input4) {
		char fname[]=input1.toCharArray();
		char lname[]=input2.toCharArray();
		char f=0,l=0;
		if(fname.length<lname.length) {
			for(int i=0;i<fname.length;i++) {
				f=fname[fname.length-1];
			}
			System.out.print(Character.toUpperCase(f));
		}
		
		else {
			for(int i=0;i<lname.length;i++) {
				l=lname[lname.length-1];
			}
			System.out.print(Character.toUpperCase(l));
		}
		for(int j=0;j<fname.length;j++) {
			if(fname[j]>='A' && fname[j]<='Z') {
				fname[j]=(char)(fname[j]+'a'-'A');
			}
			else if(fname[j]>='a' && fname[j]<='z') {
				fname[j]=(char)(fname[j]+'A'-'a');
			}
		}
		System.out.print(fname);
		String str=Integer.toString(input3);
		String rev="";
		System.out.print(str.charAt(input4));
		for(int k=str.length()-1;k>=0;k--) {
			rev=rev+str.charAt(k);
		}
		System.out.print(rev.charAt(input4));
		
	}
}
public class userid {
	public static void main(String args[]) {
		useridGeneration ui=new useridGeneration();
		String q= "Pinaki";
		String r= "Ganguly";
		System.out.print("The userid is : ");
		ui.find(q, r, 45678, 1);
	}
}
