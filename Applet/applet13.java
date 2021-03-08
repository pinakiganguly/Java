package Pinaki;
import java.applet.*;
import java.awt.*;
public class applet13 extends Applet {
	public void init() {
	 setBackground(Color.yellow);
	   setForeground(Color.blue);
	   Label l1=new Label("Enter username");
	  TextField t1=new TextField(10);
	  t1.setText("arpita@gmail.com");
	  t1.setEditable(false);
	  Label l2=new Label("Enter password");
	   TextField t2=new TextField(10);
	   t2.setEchoChar('#');
	   Label l3=new Label("Enter comment");
	TextArea t3=new TextArea("Type here",20,50);
	   Button b1=new Button("Submit");
	   Button b2=new Button("Cancel");
	   add(l1);
	   add(t1);
	   add(l2);
	   add(t2);
	  add(l3);
	   add(t3);
	   add(b1);
	   add(b2);
	  }
 
	}
