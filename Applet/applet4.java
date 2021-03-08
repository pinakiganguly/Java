package Pinaki;

import java.awt.*;
import java.applet.*;
public class applet4 extends Applet
{
  int r1,g1,b1;
  Color c;
  public void paint(Graphics g)
  
  { r1=(int)(Math.round(Math.random()*255));  //random()  val>0.0 and < 1.0
    g1=(int)(Math.round(Math.random()*255));
    b1=(int)(Math.round(Math.random()*255));
    c=new Color(r1,g1,b1);
    
    g.setColor(c);
   
   g.fillArc(400,200,700,400,0,180);
   g.setColor(Color.black);
   g.drawLine(750, 400, 750, 700);
   g.drawArc(750, 680, 40, 40, 0, -180);
   
   try
    {
    	Thread.sleep(500);
      repaint();
    }
    catch(Exception e)
    {}
  }
}
