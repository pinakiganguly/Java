package Pinaki;

import java.applet.*;
import java.awt.*;
public class applet3 extends Applet implements Runnable
{
  static int i=1;
  Thread t;
  boolean b;
  
  public void start()  // Applets  1.
  {
      t = new Thread(this);
  
      t.start();// Thread
   }
  public void run()// implemented the Runnable  2.
  {
      for(int i=1;i<=10;i++)
      {  
        repaint();
         try
         {
           Thread.sleep(1000);// main thread to sleep for 1000ms
         }
         catch(Exception e){}
      }
    
  }
 public void paint(Graphics g)  //3.
  {
      if(i%2!=0)
      {
        g.drawString("Odd is="+i,100,100);
       // i++;
      }

      else
        g.drawString("even is="+i,100,100);
        
      i++;
  }
}
  
