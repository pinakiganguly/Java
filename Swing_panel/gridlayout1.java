package Pinaki1;


/*import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class gridlayout1 {
   public static final String[][] BUTTON_TEXTS = {
      {"7", "8", "9", "+"},
      {"4", "5", "6", "-"},
      {"1", "2", "3", "*"},
      {"0", ".", "/", "="}
   };
   public static final Font BTN_FONT = new Font(Font.SANS_SERIF, Font.BOLD, 24);

   private static void createAndShowGui() {
      JTextField field = new JTextField(10);
      field.setFont(BTN_FONT.deriveFont(Font.PLAIN));
      JPanel btnPanel = new JPanel(new GridLayout(BUTTON_TEXTS.length,
            BUTTON_TEXTS[0].length));

      for (int i = 0; i < BUTTON_TEXTS.length; i++) {
         for (int j = 0; j < BUTTON_TEXTS[i].length; j++) {
            JButton btn = new JButton(BUTTON_TEXTS[i][j]);
            btn.setFont(BTN_FONT);
            btnPanel.add(btn);
         }
      }

      JPanel mainPanel = new JPanel(new BorderLayout());
      mainPanel.add(field, BorderLayout.PAGE_START);
      mainPanel.add(btnPanel, BorderLayout.CENTER);


      JFrame frame = new JFrame("Calc2");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(mainPanel);
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGui();
         }
      });
   }
}*/
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import Pinaki2.thread1;

/*public class gridlayout1  
{ public static void main(String s[])
  {
    Frame f=new Frame();
    f.setLayout(new GridLayout(3,2));
   Label l1=new Label("enter username",Label.CENTER);
   f.add(l1);
   TextField t1=new TextField(10);
    Label l2=new Label("enter password",Label.CENTER);
   TextField t2=new TextField(10);
   t2.setEchoChar('*');
   Button b1=new Button("Submit");
   //Button b2=new Button("Reset");
    f.add(t1);
    f.add(l2);
    f.add(t2);
    f.add(b1);
    //f.add(b2);
    f.setSize(400,100);
    f.setVisible(true); 
    
    
    f.addWindowListener(new WindowAdapter()
    { public void windowClosing(WindowEvent e)
        {  System.exit(0);
        }
    });
   }
 }*/


/*import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class gridlayout1 extends Frame implements ActionListener
{
  TextField nameField, passField, resultField;
  Label lab1, lab2, lab3;
  public gridlayout1()
  {                       // set layout
    setLayout(new GridLayout(3, 2, 0, 10));  
    setBackground(Color.pink);  // fill the gap with color
                         // create components
    nameField = new TextField(15);
    passField = new TextField(15);
    resultField = new TextField(15);
    lab1 = new Label("Enter User Name");
    lab2 = new Label("Enter Password");
    lab3 = new Label("Display Result");
    	             // register the listener
    passField.addActionListener(this);
    	            // beautification
    passField.setEchoChar('*');
    resultField.setEditable(false);

    add(lab1);   add(nameField);
    add(lab2);   add(passField);
    add(lab3);   add(resultField);

    setTitle("User Name & Password Validation");
    setSize(300, 300);
    setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {                   // get the values entered by the user
     String str1 = nameField.getText();
     String str2 = passField.getText();
                        // some validation code
     if(str1.equals("snrao") && str2.equals("java"))
     {
       resultField.setText("VALID");
     }
     else
     {
       resultField.setText("INVALID, TRY AGAIN");
     }
   }
   public static void main(String args[])
   {
     new gridlayout1();
   }
   
}*/

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class gl extends Frame implements ActionListener
{
	int s=0,r=0;
	Button b[]=new Button[15];
	Button b1[]=new Button[20];
	String op2[]={"+","-","*","/","="};
	String str1="";
	
	String operation;
	TextField t1=new TextField();
	gl(String s)
	{
		super(s);
		setSize(300,200);
		
		t1.setEditable(true);
		
		setLayout(new GridLayout(4,4));
		for(int i=1;i<=9;i++) {
			b[i]=new Button(""+i);
			add(b[i]);
			b[i].addActionListener(this);
		}
		for(int j=10;j<=10;j++) {
			if(j==10)
				add(new Button("0"));
				b[j].addActionListener(this);
		}
		for(int i=0;i<5;i++) {
			b1[i]=new Button(""+op2[i]);
			add(b1[i]);
			b1[i].addActionListener(this);
		}
		 add(t1);
			
		
		
		setVisible(true);
		addWindowListener(new WindowAdapter()
	    { public void windowClosing(WindowEvent e)
	        {  System.exit(0);
	        }
	    });
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals ("+")){
			s=Integer.parseInt(t1.getText());
			operation=e.getActionCommand();
			t1.setText(str1="");
		}
		else if(e.getActionCommand().equals("-")){  
			s=Integer.parseInt(t1.getText());
			operation=e.getActionCommand();                                                         
	        t1.setText(str1=""); 
		}
                                           
		else if(e.getActionCommand().equals("*")){  
			s=Integer.parseInt(t1.getText());
			operation=e.getActionCommand();                                                    
			t1.setText(str1="");
		}
		else if(e.getActionCommand().equals("/")){  
			s=Integer.parseInt(t1.getText());
	         operation=e.getActionCommand();                                                    
	        t1.setText(str1="");
		}
		else if(e.getActionCommand().equals("=")) { str1="";                                                        
        if(operation.equals("+"))  {
        r=Integer.parseInt(t1.getText());
        t1.setText(String.valueOf((s+r)));}

        else if(operation.equals("-")) {
        r=Integer.parseInt(t1.getText());
        t1.setText(String.valueOf((s-r))); }

        else  if(operation.equals("*")){
        r=Integer.parseInt(t1.getText());
        t1.setText(String.valueOf((s*r))); }

        else if(operation.equals("/")){
        r=Integer.parseInt(t1.getText());
        t1.setText(String.valueOf((s/r))); }
 }
	}
}
public class gridlayout1 {

	
	public static void main(String s[])
	{
		gl g=new gl("Calculator");
		 
	}
}
