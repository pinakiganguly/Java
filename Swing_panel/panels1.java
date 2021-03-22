package Pinaki1;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

class textPanel extends Panel
{
	TextField Text1;
	textPanel()
	{
		Text1 = new TextField(30);
		add(Text1);
	}
}

public class panels1 extends Applet implements ActionListener
{
	Button button1,button2,button3,button4;
	textPanel Panel1;
	public void init()
	{
		setLayout(new BorderLayout());
		
		button1 = new Button();
		add("North",button1);
		button1.addActionListener(this);
		
		button2 = new Button();
		add("West",button2);
		button2.addActionListener(this);
		
		button3 = new Button();
		add("East",button3);
		button3.addActionListener(this);
		
		button4 = new Button();
		add("South",button4);
		button4.addActionListener(this);
		
		Panel1= new textPanel();
		add("Center",Panel1);
		Panel1.Text1.setLocation(0,0);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Panel1.Text1.setText("Button"+((Button)e.getSource()).getLabel()+"clicked");
	}
	
	
	
}