package Pinaki;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class flowLayout 
{ 
	public static void main(String s[])
  {
    Frame f=new Frame();// default layout BorderLayout
    f.setLayout(new FlowLayout());
    
   Label l1=new Label("enter username",Label.CENTER);
   f.add(l1);
   TextField t1=new TextField(10);// username
    Label l2=new Label("enter password",Label.CENTER);
   TextField t2=new TextField(10);// password
   t2.setEchoChar('*');
   Button b1=new Button("Submit");
   Button b2=new Button("Reset");
    f.add(t1);
    f.add(l2);
   
    f.add(t2);
   System.out.println("");
    f.add(b1);
    f.add(b2);
    f.setSize(300,100);
    f.setVisible(true);            
   
   
    f.addWindowListener(new WindowAdapter()
    { public void windowClosing(WindowEvent e)
        {  System.exit(0);
        }
    });
    
   
   }
 }
