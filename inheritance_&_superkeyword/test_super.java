package Pinaki;


class supertest1{
	 supertest1(int a1,int b1)
	{
		int a=a1;
		int b=b1;
		System.out.println("a="+a+"b="+b);
	}
}
class subtest extends supertest1 {
	subtest(int a1,int b1,int c1)
	{
		super(a1,b1);//invokes parent constructor
		int c=c1;
		System.out.println("c="+c);
		
	}
}
public class test_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subtest obj=new subtest(21,11,31);
		//obj.subtest1(21, 11, 30);
	}

}
