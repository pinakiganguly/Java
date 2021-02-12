package Pinaki;
import java.util.Scanner;
class Box{
	int w,h,d;
	float v;
	Box(int ww,int hh,int dd){
		w=ww;
		h=hh;
		d=dd;
	}
	void volume() {
		v=w*h*d;
		System.out.println("volume of the box= "+v+" cubicunits");
	}
}

public class Box_volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int w,h,d;
		System.out.println("Enter width=");
		w=sc.nextInt();
		System.out.println("Enter height=");
		h=sc.nextInt();
		System.out.println("Enter depth=");
		d=sc.nextInt();
		Box b=new Box(w,h,d);
		b.volume();
		

	}

}
