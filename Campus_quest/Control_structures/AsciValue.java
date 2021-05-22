
import java.util.Scanner;

public class AsciValue{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       int d,e,f,g;
       char c1,c2,c3,c4;
        System.out.println("Enter the digits:");
        d=sc.nextInt();
        e=sc.nextInt();
        f=sc.nextInt();
        g=sc.nextInt();
        c1=(char)d;
        c2=(char)e;
        c3=(char)f;
        c4=(char)g;
        System.out.println(d+"-"+c1+"\n"+e+"-"+c2+"\n"+f+"-"+c3+"\n"+g+"-"+c4);
        
        
    }
    
}
