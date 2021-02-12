package Pinaki;
class call
{
  int i;//instance variable
  call(int ii)
  {
    i=ii;
  }
    void change1(int i)
    {
    i=i*20;
  System.out.println("inside method(callby val)="+i);//i=400
  
  }
  
  void change2(call c)
  {
    c.i=c.i*20;// instance var is updated
    System.out.println("inside method(callby ref)="+c.i);// c.i=400
 }
}//call
public class call_ref_val {
	  public static void main(String args[])
	  {
	    call obj=new call(20);
	    System.out.println("before callby val"+obj.i);//i=20
	    obj.change1(20);
	       
	    System.out.println("after callby val"+obj.i);//i=20  
	  
	   System.out.println("before callby ref"+obj.i);//i=20
	    obj.change2(obj);
	    System.out.println("after callby ref"+obj.i);  //obj.i=400               
	    //System.out.println("after callby ref"+obj.i); 
	    
	  }

}

