package Pinaki;

class box2
{
  double width,height,depth;
 box2(double w, double h, double d)
 {
  this.width=w;
  this.height=h;
  this.depth=d;
 }
 double volume()
 {
  return (width*height*depth);
 }
 
   protected void finalize()   
    {   
        System.out.println("finalize method called");   
    }   

}

public class destructor
{
 public static void main(String args[])
   {
     box2 obj=new box2(10,20,30);
       System.out.println("volume="+obj.volume());

        obj = null; 
        System.gc(); 
 }   
}

