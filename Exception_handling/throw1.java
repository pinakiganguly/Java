package Pinaki;
public class throw1{
	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		}catch(NullPointerException e) {
			System.out.println("Caught inside demoproc.");
			//throw e;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demoproc();
		}catch(NullPointerException e) {    //due to matching of exception in catch block
			System.out.println("Recaught:"+e);
		}
	}

}
