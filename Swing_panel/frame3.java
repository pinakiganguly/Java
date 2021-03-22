package Pinaki;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class frame3 extends Applet {
	public static void main(String args[]) {
		Appframe f=new Appframe();
		f.setSize(200,200);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.show();
	}
	public void paint(Graphics g) {
		g.drawString("Hello from Java!", 60, 100);
	}
}
class Appframe extends Frame{
	public void paint(Graphics g) {
		g.drawString("Hello from Java!", 160, 160);
	}
}