package Pinaki;
import java.awt.*;
import java.applet.*;
public class applet16 extends Applet {
	public void init() {
		Label l1=new Label("Actor's name");
		 
	      Checkbox c1=new Checkbox("Soumitra Chatterjee",true);
	      Checkbox c2=new Checkbox("Amir Khan",false);
	      Checkbox c3=new Checkbox("Rowan Atkinston",false);
	      add(l1);
	      add(c1);
	      add(c2);
	      add(c3);
	      
	      
	     Label l2=new Label("TV channels");
	     CheckboxGroup cbg=new CheckboxGroup();
	     Checkbox d1=new Checkbox("Sony Sab",cbg,true);
	     Checkbox d2=new Checkbox("HBO",cbg,false);
	     Checkbox d3=new Checkbox("Sony Sab",cbg,false);
	     add(l2);
	      add(d1);
	      add(d2);
	      add(d3);
	      
	      
	      Choice color= new Choice();
	      color.add("Feluda");
	      color.add("The 3 mistakes of my life");
	      color.add("Geetobitan");
	      add(color);
	      
	      List car=new List(3,true);

	     car.add("Honda");
	     car.add("Tesla");
	      car.add("Ford");
	      car.add("Tata");
	      car.add("Aston Martin");
	      
	      add(car);
	}
}
