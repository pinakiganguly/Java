package Pinaki1;
class Nambiar_Num_Gen{
	int nnGenerator(String input1) {
		int sum=0,k,i=0,first;
		String s="";
		for(i=0;i<input1.length();) {
			first=input1.charAt(i)-'0';
			sum=first;
			k=i+1;
			while(k<input1.length()&&first%2==sum%2) {
				sum+=input1.charAt(k)-'0';
				k++;
			}
			i=k;
			s+=sum;
		
		}
		return Integer.parseInt(s);
	}
}
public class nnGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Nambiar_Num_Gen obj=new Nambiar_Num_Gen();
		a=obj.nnGenerator("9860857152");
		System.out.println(a);
	}

}


