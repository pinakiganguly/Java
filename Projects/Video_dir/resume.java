package Pinaki_Project2;
import java.awt.*;
import java.applet.*;
public class resume extends Applet {
	public void paint(Graphics g) {
		//g.drawString("Pinaki Ganguly", 400, 300);
		//g.drawString("Personal Info:",100,10);
		//g.drawString("", x, y);
	}
	public void init() {
		TextArea t1=new TextArea("Pinaki Ganguly"+"Personal info:"
				+ "Date of Birth- 13/12/1999"+"Nationality- Indian"+"Address- SB-1-A MCPI Housing Complex Azad Hind Nagar, Haldia Township"+"Email address- pinakiganguly0003@gmail.com"+"Phone No.: 7602531877",10,50);
		add(t1);
		
		TextArea t2=new TextArea("Profile: "+"I am now just a student of 3rd B.Tech in Computer Science and I have only passed the +2 grade. I am a keen lover of  all new technological stuffs. I am flexible, innovative and enthusiastic student. I have done some courses and trainings which may be useful for your work. The list of those are given below.",10,50);
		add(t2);
		
		TextArea t3=new TextArea("Projects: "+"Did a Web Development Project at Kolkata designing a e-Mall",10,50);
		add(t3);
		
		Label l1 =new Label("Educations:");
		List l=new List(1,true);
		l.add("+2 from St.Xavier's School,Haldia");
		l.add("B.Tech in Computer Sciencs From Haldia Institute of Technology");
		add(l1);
		add(l);
		
		Label l4=new Label("Skills:");
		Checkbox ch=new Checkbox("C",true);
		Checkbox ch1=new Checkbox("Java",true);
		Checkbox ch2=new Checkbox("HTML,CSS",true);
		Checkbox ch3=new Checkbox("JavaScript",true);
		Checkbox ch4=new Checkbox("Php",true);
		
		add(l4);
		add(ch);
		add(ch1);
		add(ch2);
		add(ch3);
		add(ch4);
		
		
		
	}
}
