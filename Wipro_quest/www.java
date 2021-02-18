package Pinaki1;
class find{
public int findStringCode(String input1){
	int sum_FL=0;
	//String s="";
	input1=input1.toUpperCase();
	StringBuilder StringCode=new StringBuilder();
	String str[]=input1.split(" ");
	for(int i=0;i<str.length;i++) {
		sum_FL=0;
		if(str[i].length()%2==0) {
			for(int j=0;j<str[i].length()/2;j++) {
				sum_FL+=Math.abs((int)str[i].charAt(j)-(int)str[i].charAt(str[i].length()-j-1));
				//System.out.println(sum_FL+"\n");
			}
		}
		else {
			for(int j=0;j<str[i].length()/2;j++) {
				sum_FL+=Math.abs((int)str[i].charAt(j)-(int)str[i].charAt(str[i].length()-j-1));
			}
			sum_FL+=(int)str[i].charAt(str[i].length()/2)-64;
			//System.out.println(sum_FL+"\n");
		}
		StringCode.append(sum_FL);
		//s+=sum_FL;
	}
	return Integer.parseInt(new String(StringCode));
	
}}
public class www {
	public static void main(String args[]) {
		find f=new find();
		System.out.println(f.findStringCode("WORLD WIDE WEB"));
}}
