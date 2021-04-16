package Pinaki;

import java.io.*;
public class file1 {
public static void main(String[] args) {
try {
File file = new File("E:/Java/Pinaki/window1.txt");
if (file.createNewFile()) {
System.out.println("New File is created!");
} else {
System.out.println("File already exists.");
}
} catch (IOException e) {
e.printStackTrace();
}
}
}