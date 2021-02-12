package Pinaki;

import java.util.*;
class arraylist1
{
    public static void main(String args[])
    {
        ArrayList a1=new ArrayList();
        System.out.println("Initial size of the list="+a1.size());
        a1.add("A");
        a1.add("B");
        a1.add("D");
        a1.add("E");
        a1.add("F");
        a1.add(2,"C");
        System.out.println("Size of the list after insertion="+a1.size());
        System.out.println("Content of the list="+a1);
        a1.remove("F");
        System.out.println("Content of the list after remove ="+a1);
        a1.remove(2);
        System.out.println("Content of the list after remove ="+a1);
        System.out.println("Size of the list after insertion="+a1.size());
    }
}

