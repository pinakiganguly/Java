package Pinaki;

class Library
{
  int Bookno;
  
  void setBookNo(int b)  //setters method
  {
    Bookno=b;
  }
  
  void display1()
  {
    System.out.println("Book no:"+Bookno);
  }
}
  class Book extends Library
  {
    String author,title;
    
    void setinfo(String s1,String s2)//
    {
  	author=s1;
      title=s2;
    }
    void display2()
    {
      System.out.println("author= "+author);
      System.out.println("title= "+title);
    }
  }// class Book
  interface Language
  { 
    String l="English";// implicitly final var
    void display3();// implicitly abstract method
  }
  class Issue extends Book implements Language
  {
    public void display3()
    {
      System.out.println("Book written in"+l);
    }
    void display4()
    {
      System.out.println("issue");
      display1();// bookno of class Library
      display2();// author,title of class Book
      display3();// language l from  class Issue
    }
  }
public class interface3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Issue i=new Issue();
	    i.setBookNo(100);// class Library
	    i.setinfo("Schildt","java programming");// class Book
	    i.display4();
	}
}
