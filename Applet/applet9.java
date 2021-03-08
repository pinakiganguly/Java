package Pinaki;
import java.awt.*;
import java.applet.*;
public class applet9 extends Applet {
	public void init() {   //initializing the control
		Label one=new Label("One");
		Label two= new Label("Two");
		Label three=new Label("Three");
		TextField t1=new TextField(20);
		Button b1=new Button("Click");
		add(one);  //overiding the function.
		add(two);
		add(three);
		add(t1);
		add(b1);
	}
}
