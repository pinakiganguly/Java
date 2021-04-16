package Pinaki;

import java.io.*;
class file6
{
public static void main(String[] args) throws Exception
{
FileOutputStream fout = new FileOutputStream("E:/Java/Pinaki/window1.txt");
PrintStream pout = new PrintStream(fout);
pout.println(2000);
pout.println("Hello Java");
pout.println("Welcome To CST");
pout.close();
pout.close();
}
}