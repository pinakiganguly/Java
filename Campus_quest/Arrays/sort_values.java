
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int n,t;
        int arr[]=new int[10];
        System.out.println("Enter the array size");
        n=sc.nextInt();
        System.out.println("Enter the values");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
