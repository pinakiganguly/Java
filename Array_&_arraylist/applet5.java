package Pinaki;

import java.awt.*;
import java.applet.*;

public class applet5 extends Applet
{ 
  public void paint(Graphics g)
{
  //g.drawLine(10,10,100,10);
 
	  //g.drawRect(109,5,120,120);
   // g.setColor(Color.GREEN);
    
//  g.fillRect(80,90,120,40);
	  g.setColor(Color.yellow);
  g.fillOval(400,200,300,300);
  g.setColor(Color.black);
  g.drawOval(460, 290, 50, 50);
  g.drawOval(590, 290, 50, 50);
  g.fillOval(470, 300, 30, 30);
  g.fillOval(600, 300,30, 30);
  g.setColor(Color.RED);
  g.fillArc(470, 360, 160, 90, 0, -180);
//  g.setColor(Color.blue);
//  g.drawLine(400, 280, 550, 30);
//  g.drawLine(700, 280, 550, 30);
//  g.drawLine(400, 280, 700, 280);
  g.setColor(Color.blue);
  int x1[] = {440,320,350,500,800, 660 };
  int y1[] = {250,190 ,100,50,150,250 };
  g.fillPolygon (x1, y1, 6);
  
 
   //g.fillOval(180,90,120,40);
  
 /* g.setColor(Color.red);
  g.drawArc(10,180,100,50,0,-180);
  g.fillArc(10,180,100,50,0,180);*/
  
  }
}
