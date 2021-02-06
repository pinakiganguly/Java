package Pinaki;
//static polymorphism
public class StaticPoly {   //method overloading
	
	int add(int a, int b) {
		return(a+b);
	}
	
	String add(String a,String b){
		return(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticPoly obj=new StaticPoly();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add("India","is great" ));
		//System.out.println(obj.add(10, 20.0));  //This binding is done during running......so it is run time polymorphism.
	}

}
