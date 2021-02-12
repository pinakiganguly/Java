package Pinaki;
class Weather
{ String city;
  int temp;
  Weather(String s1,int t1)
  {
	city=s1;
    temp=t1;
  }
  void show()
  {
	  System.out.println("city"+"  "+city+"    temp"+"  "+temp);
  }
}// weather 
public class array2
{
  public static void main(String s[])
   {
	    int i,j;
	    Weather w[]=new Weather[4];
	    w[0]=new Weather("Kolkata",34);
	    w[1]=new Weather("Mumbai",32);
	    w[2]=new Weather("Chennai",40);
	    w[3]=new Weather("Delhi",42);
	int n=w.length;
	Weather t;
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
     if(w[i].city.compareTo(w[j].city)>0)// return 0 when strings same
     {                                    // >0 it is not in alphabetical order
       t=w[i];                       // <0 already alphabetically sorted
       w[i]=w[j];
       w[j]=t;
     }
    }
  } 
    for(i=0;i<n;i++)
      w[i].show();
  }
  }

