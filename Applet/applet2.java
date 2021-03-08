package Pinaki;

import java.awt.*;// abstract window toolkit
import java.applet.*;
public class applet2 extends Applet
{
  String out;
  public void init()
{//setBackground(Color.blue);
    //setForeground(Color.white);
    System.out.println("init");
    out="init->";
  }
  
  public void start()
  {System.out.println("Start");
    out+="start->";
  }
   public void stop()
  {System.out.println("stop");
   }
   
    public void destroy()
  {System.out.println("destroy");
   }
    
    
   public void paint(Graphics g)
    {
      System.out.println("paint");
      
      out+="paint->";
      g.drawString(out,100,200);
    }
}

