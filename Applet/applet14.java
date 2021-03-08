package Pinaki;
import java. awt.*;
import java.awt.event.*;
import java.applet.*;
public class applet14 extends Applet {
	public void init() {
		Label one=new Label("1st number");
		TextField t1=new TextField(10);
		add(one);
		add(t1);
		
		Label two=new Label("2nd number");
		TextField t2=new TextField(10);
		add(two);
		add(t2);
		
		Label three= new Label("Result");
		TextField t3=new TextField(10);
		add(three);
		add(t3);
		
		Button b=new Button("+");
		Button b1=new Button("-");
		Button b2=new Button("*");
		Button b3=new Button("/");
		add(b);
		add(b1);
		add(b2);
		add(b3);
	}
	
}
