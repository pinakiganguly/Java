package Pinaki2;
class random implements Runnable{
	public void run() {
		int i;
		String colours[]= {"white","blue","black","red","green","yellow"};
		for(i=0;i<colours.length;i++) {
			if(colours[i].equals("red")) {
				break;
			}
			System.out.println(colours[i]);
		}
	}
}

public class thread_ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		random r=new random();
		Thread mythread=new Thread(r);
		mythread.start();
	}

}
