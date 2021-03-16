package Pinaki1;
import java.awt.*;
import javax.swing.*;
public class swing5 {
	public static void main(String args[]) {
		String fileName="E:\\Java\\Pinaki\\src\\Pinaki1\\p4.jpg";
		ImageIcon icon=new ImageIcon(fileName);
		JLabel label=new JLabel(icon);
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(new JScrollPane(label));
		f.setSize(400,400);
		f.setLocation(200,200);
		f.setVisible(true);
	}
}
