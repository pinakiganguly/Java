package Pinaki1;

class pallindrome1 {
	 int digit_remove(int input) {
		
		int a[]=new int[10];
		int count =0;
		while(input>0) {
			a[count++]=input%10;
			input/=10;		
		}
		int j=count-1;
		int index=-1;
		for(int i=0;i<j;i++) {
			if(a[i]!=a[j]) {
				if(a[i+1]==a[j])
					index=i;
				else
					index=j;
				break;
			}
			--j;
		}
		if(index==-1)
			return -1;
		return a[index];
	}
}
public class pallindrome_maker{
	public static void main(String args[]) {
		pallindrome1 pal=new pallindrome1();
		System.out.println(pal.digit_remove(981894));
	}
}
