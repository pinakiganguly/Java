//testmain.java file code
import java.util.Scanner;

public class TestMain

{

   public static void main(String args[])

   {

       Scanner Sc = new Scanner(System.in);

       VolumeCalculator vol = new VolumeCalculator();

       int n;

       System.out.print("Press 1 : Find Volume For Cylinder \nPress 2: Find Volume For Cuboid \nEnter your choice : ");

       n = Sc.nextInt();

       if(n == 1)

       {

           System.out.print("Enter radius : ");

           double radius = Sc.nextDouble();

           System.out.print("Enter height : ");

           double height = Sc.nextDouble();

           System.out.print("Volume of the Cylinder is " + Math.round(vol.calculateVolume(radius , height) * 100.0) / 100.0 );

       }

       else if(n == 2)

       {

           System.out.print("Enter length : ");

           int length = Sc.nextInt();

           System.out.print("Enter breadth : ");

           int breadth = Sc.nextInt();

           System.out.print("Enter height : ");

           int height = Sc.nextInt();

           System.out.print("Volume of the Cuboid is " + vol.calculateVolume(length , breadth , height));

       }

       else

       {

           System.out.print("Invalid choice");

       }

   }

}
//------------------------------------------------------------------------------------------------------------------


//Volumecalculator.java file code


import java.util.*;

public class VolumeCalculator

{

   public double calculateVolume(double radius, double height)

   {

       return (3.14 * radius * radius * height);

   }

   public double calculateVolume(int length,int breadth,int height)

   {

       return (length * breadth * height);

   }

}

