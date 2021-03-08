package Pinaki;
import java.awt.*;
import java.applet.*;
public class applet6 extends Applet {

	public void paint(Graphics g) {
			g.setColor(Color.BLUE);
			g.drawOval(500, 200, 300, 300);
			g.setColor(Color.BLACK);
			g.drawOval(830, 200, 300, 300);
			g.setColor(Color.RED);
			g.drawOval(1160, 200, 300, 300);
			Color GOLD = new Color(255,204, 51);
			g.setColor(GOLD);
			g.drawOval(660, 400, 300, 300);
			g.setColor(Color.green);
			g.drawOval(990, 400, 300, 300);
			
		}
}

