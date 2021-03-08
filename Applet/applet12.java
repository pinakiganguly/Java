package Pinaki;
import java.applet.*;
import java.awt.*;
public class applet12 extends Applet {
	public void paint(Graphics g) 
	  { 
		  int x[] = { 70, 150, 190, 80, 100 }; int y[] = { 80, 110, 160, 190, 100 };
		  g.drawPolygon (x, y, 5);
		  int x1[] = { 210, 280, 330, 210, 230 };
		  int y1[] = { 70, 110, 160, 190, 100 };
		  g.fillPolygon (x1, y1, 5); 
	  }
}
