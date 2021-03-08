package Pinaki;

import java.applet.Applet;
import java.awt.*;
public class applet15  extends Applet
{ Image i;
  public void init()
  {
    Checkbox c1=new Checkbox("Bengali",true);
     Checkbox c2=new Checkbox("English");
      Checkbox c3=new Checkbox("Hindi");
      
      
      CheckboxGroup cbg=new CheckboxGroup();
      Checkbox c4=new Checkbox("MCA",cbg,true);
     Checkbox c5=new Checkbox("M.Sc",cbg,false);
      Checkbox c6=new Checkbox("M.E",cbg,false);
      
      Choice color= new Choice();
      color.add("red");
      color.add("green");
      color.add("blue");
      
      List icecream=new List(3,true);

      icecream.add("chocolate");
      icecream.add("vanilla");
      icecream.add("strawberry");
      icecream.add("orange");
      icecream.add("mango");
      
      add(c1);
      add(c2);
      add(c3);
      add(c4);
      add(c5);
      add(c6);
      add(color);
      add(icecream);
  }
}