package Pinaki;
import java.awt.*;
import java.applet.*;
public class applet7 extends Applet {
	public void paint(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(500, 300, 450, 150);
		g.setColor(Color.black);
		g.drawRect(500, 450, 449, 149);
		g.setColor(Color.green);
		g.fillRect(500,600,450,150);
		g.setColor(Color.BLUE);
		g.drawArc(650, 450, 150, 150, 0, 360);
		g.drawLine(750,455, 700, 595);
		g.drawLine(699,455, 750, 595);
		g.drawLine(650,525, 800, 525);
		g.drawLine(665,483, 787, 567);
		g.drawLine(786,483, 663, 565);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(500, 750, 12,150 );
		g.fillRect(440,900,150,12);
		
	}
}
