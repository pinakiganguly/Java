package Pinaki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class file3
{
public static void main(String[] args) throws IOException
{
FileReader fr = new FileReader("E:/Java/inhert.java");
BufferedReader br = new BufferedReader(fr);
char c[] = new char[20];
//Illustrating markSupported() Method
if(br.markSupported())
{
System.out.println("Mark() Method Is Supported");
//Illustrating Mark Method
br.mark(100);
}
/* File Contents
This Is The 1st Line
This Is The 2nd Line
*/
//Skipping 8 Characters
br.skip(8);
//Illustrating ready() Method
if(br.ready())
{
//Illustrating readLine() Method
System.out.print(br.readLine());
//Illustrating read(char c[], int off, int len)
br.read(c);
for(int i=0 ; i<20 ; i++)
{
System.out.print(c[i]);
}
System.out.print("");
//Illustrating reset() Method
br.reset();
for(int i=0 ; i<8 ; i++)
{
//Illustrating read() Method
System.out.print((char) br.read());
}
}
}
}