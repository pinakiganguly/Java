package Pinaki;

import java.util.*;
class arraylist2
{
    public static void main(String args[])
    {
        ArrayList a1=new ArrayList();
        System.out.println("Initial size of the list="+a1.size());
        a1.add(new Integer(10));
        a1.add(new Integer(20));
        a1.add(new Integer(30));
        a1.add(new Integer(40));
        System.out.println("Content of the list="+a1);
        Object ia[]=a1.toArray();
        int s=0;
        for(int i=0;i<ia.length;i++)
        s+=((Integer)ia[i]).intValue();
        System.out.println("Sum is="+s);
    }
}

