package Pinaki;
class input{
	void result(int p[],int q) {
		int s=0, firstNo;
		for(int i=q-1;i>0;i--) {
			p[i-1]=p[i-1]-p[i];
		}
		firstNo=p[0];
		for(int i=0;i<q;i++) {
			s=s+p[i];
		}
		System.out.println("First no.="+firstNo+"\n"+"Sum of the original="+s);
	}
}
public class encoding {
	public static void main(String args[]) {
		input in=new input();
		int p[]= {7,6,9,10,4};
		int n=5;
		in.result(p,n);
	}
}
