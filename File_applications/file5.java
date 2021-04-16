package Pinaki;

import java.io.FileWriter;
public class file5
{
public static void main(String[] args)
{
try
{
FileWriter fw = new FileWriter("E:/Java/Pinaki/window1.txt");
fw.write("Welcome To CS&T In GIST");
fw.close();
} catch (Exception e)
{
System.out.println(e);
}
System.out.println("Success");
}
}
