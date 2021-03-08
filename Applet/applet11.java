package Pinaki;
import java. awt.*;
import java.awt.event.*;
import java.applet.*;
public class applet11 extends Applet implements ActionListener 
{
	String result;
	//Button sum;
	Label one=new Label("1st number");
	TextField t1=new TextField(10);
	Label two=new Label("2nd number");
	TextField t2=new TextField(10);
	Label three= new Label("Result");
	TextField t3=new TextField(10);
	Button b=new Button("Add");
	Button b1=new Button("Substract");
	Button b2=new Button("Mult");
	Button b3=new Button("Div");
	public void init() {
		
		add(one);
		add(t1);
		add(two);
		add(t2);
		add(three);
		add(t3);
		add(b);
		add(b1);
		add(b2);
		add(b3);
		
		t1.addActionListener(this);
		t2.addActionListener(this);
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b) {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			t3.setText(""+(a+b));
		}
		else if(ae.getSource()==b1) {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			t3.setText(""+(a-b));
		}
		else if(ae.getSource()==b2) {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			t3.setText(""+(a*b));
		}
		else if(ae.getSource()==b3) {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			t3.setText(""+(a/b));
		}
	}
}