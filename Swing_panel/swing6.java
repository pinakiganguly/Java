package Pinaki1;
import javax.swing.*;
import java.io.*;
public class swing6 extends JFrame{
	public swing6() {
		setLocation(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JTextArea ta= new JTextArea(20,40);
		getContentPane().add(new JScrollPane(ta));
		pack();
		try {
			ta.read(new FileReader("E:\\Java\\Pinaki\\src\\Pinaki1\\swing6.java"), null);
		}
		catch(IOException ioe) {
		}
	}


	public static void main(String args[]) {
		new swing6().setVisible(true);
	}
}
