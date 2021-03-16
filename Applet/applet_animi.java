package Pinaki;

import java.applet.*;

import java.awt.*;
public class applet_animi extends Applet
{  
	Image img;
	
  
  public void init()
  { 
    
    	img=getImage(getCodeBase(),"https://tinyjpg.com/images/social/website.jpg");
 
    
  }
  public void paint(Graphics g)
  {
  
  
	  for (int i = 500; i < 1000; i++)  
      {  
          g.drawImage(img, i, 30, this);  
          try  
          {  
              Thread.sleep(400);  
          } catch (Exception e) {}  
      }  
  }
}

/*import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
 
public class applet_animi extends Applet {
     
    private static final long serialVersionUID = 2530894095587089544L;
     
    private Image image;
     
    // Called by the browser or applet viewer to inform
    // this applet that it has been loaded into the system.
    public void init() {
         
        image = getImage(getDocumentBase(), "https://tinyjpg.com/images/social/website.jpg");
         
    }
     
    // Paints the container. This forwards the paint to any
    // lightweight components that are children of this container.
    public void paint(Graphics g) {
         
        // draws as much of the specified image as is currently available
        g.drawImage(image, 100, 50,this);
         
    }
 
}*/
