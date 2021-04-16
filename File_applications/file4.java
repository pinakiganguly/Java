package Pinaki;

import java.io.*;
public class file4
{
public static void main(String[] args) throws Exception
{
FileWriter writer = new FileWriter("E:/Java/Pinaki/window1.txt");
BufferedWriter buffer = new BufferedWriter(writer);
buffer.write("Pinaki Ganguly");
buffer.write("\n 20");
buffer.close();
System.out.println("Success");
}
}
