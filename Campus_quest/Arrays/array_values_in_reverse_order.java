
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        
        int arr[]=new int[20];
        int n;
        System.out.println("Enter the array size");
        n=sc.nextInt();
        System.out.println("Enter the values");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
