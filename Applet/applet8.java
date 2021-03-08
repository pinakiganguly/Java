package Pinaki;
import java.awt.*;
import java.applet.*;
public class applet8 extends Applet {
	Color c,c1,c2,c3,c4;
	int y1,r1,g1,b1;
	public void paint(Graphics g) {
		g.fillRect(500, 300, 1000,12);
		
		y1=(int)(Math.round(Math.random()*255));
		r1=(int)(Math.round(Math.random()*255));
		g1=(int)(Math.round(Math.random()*255));
		b1=(int)(Math.round(Math.random()*255));
		c=new Color(r1,g1,b1);
		c1=new Color(y1,g1,b1);
		c2=new Color(y1,r1,g1);
		c3=new Color(y1,r1,b1);
		c4=new Color(y1);
		g.setColor(c);
		g.fillOval(520, 310, 30, 50);
		g.fillOval(550, 310, 30, 50);
		g.setColor(c1);
		g.fillOval(750, 310, 30, 50);
		g.fillOval(780, 310, 30, 50);
		g.setColor(c2);
		g.fillOval(950, 310, 30, 50);
		g.fillOval(980, 310, 30, 50);
		g.setColor(c3);
		g.fillOval(1150, 310, 30, 50);
		g.fillOval(1180, 310, 30, 50);
		g.setColor(c4);
		g.fillOval(1350, 310, 30, 50);
		g.fillOval(1380, 310, 30, 50);
		
		try {
			Thread.sleep(200);
			repaint();
		}
		catch(Exception e) {}
		
		
	}
}
