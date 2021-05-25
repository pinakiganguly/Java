
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        
        int arr[]=new int[20];
        int n,k,flag=0;
        System.out.println("Enter the array size");
        n=sc.nextInt();
        System.out.println("Enter the values");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to find");
        k=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(arr[i]==k){
                System.out.println(i);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(0);
        }
        //System.out.println(i);
    }
    
}
