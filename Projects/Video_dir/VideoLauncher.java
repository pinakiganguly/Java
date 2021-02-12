package Pinaki_Project2;
import java.util.Scanner;
class video{
	public video() {
		
	}
	public String videoName;
	public boolean checkout;
	public int rating;
	public String getName() {
		return this.videoName; 
	}
	public void doCheckout() {
		
		System.out.println("Video"+getName()+"checked out successfully");
	}
	public void doReturn() {
		this.checkout=true;
		System.out.println("Video"+getName()+"returned successfully");
		//return this.videoName;
	}
	public void receiverating(int rate) {
		this.rating=rate;
	}
	public int getRating() {
		return this.rating;
	}
	public boolean getCheckout(){
		return this.checkout;
	}
	public video(String Name){
		//int r=0;
		this.videoName=Name;
		//this.rating=r;
	}
}
class videostore{
	video[] store=new video[10];
	//store[0]= new video(Name);
	
	void addVideo(String Name) {
		store[0]=new video(Name);
		System.out.println("Video"+store[0].getName()+"added successfully");
	}
	void doCheckout(String Name1) {
		if(store[0].videoName.equals(Name1))
			store[0].doCheckout();
	}
	void receiveRating(String name,int rating) {
		if(store[0].videoName.equals(name))
			store[0].receiverating(rating);;
		System.out.println("Rating"+store[0].getRating()+"has been mapped to the video"+store[0].getName());
	}
	void doReturn(String Name2) {
		if(store[0].videoName.equals(Name2))
			store[0].doReturn();
	}
	void listInventory() {
		System.out.println("-------------------------------------------");
		System.out.println("Video Name | Checkout Status | Rating");
		System.out.println(store[0].getName()+"|"+store[0].getCheckout()+"|"+store[0].getRating());
		System.out.println("-------------------------------------------");
	}
}
public class VideoLauncher {
	static void inventory() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name2=null;
		videostore vs=new videostore();
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=1;i<7;i++) {
		
		System.out.println("Adding video:");
		System.out.println("Checkout videos:");
		System.out.println("Receive rating:");
		System.out.println("Return video:");
		System.out.println("List inventory:");
		System.out.println("Exit");
		System.out.println("Enter your choice(1...6): ");
		i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.print("Enter the name of the video u want to add: ");
				sc.nextLine();
				String vName=sc.nextLine();
				vs.addVideo(vName);
				break;
			case 2:
				System.out.println("Enter the name of the video u want to checkout");
				sc.nextLine();
				Name2=sc.nextLine();
				vs.doCheckout(Name2);
				break;
			case 3:
				System.out.print("Enter the Name of the video u want to rate: ");
				sc.nextLine();
				String Name3=sc.nextLine();
				System.out.print("Enter the rating if this video: ");
				int rating=sc.nextInt();
				vs.receiveRating(Name3, rating);
				break;
			case 4:
				System.out.print("Enter the name of the book u want to return: ");
				sc.nextLine();
				String Name4=sc.nextLine();
				vs.doReturn(Name4);
				break;
			case 5:
				vs.listInventory();
				break;
			case 6:
				System.out.println("Enter.....!! Thanks for using this application");
				System.exit(1);
				break;
			}
		}while(!(i==6));
		sc.close();
	}

}
