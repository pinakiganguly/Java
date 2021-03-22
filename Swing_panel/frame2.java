package Pinaki;
import java.awt.*;
import java.awt.event.*;
class Appframe extends Frame{
	public void paint(Graphics g) {
		g.drawString("Hello from Java!", 60, 100);
	}
}
public class frame2{
	public static void main(String args[]) {
		Appframe f=new Appframe();
		f.setSize(500,500);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.show();
	}
}
