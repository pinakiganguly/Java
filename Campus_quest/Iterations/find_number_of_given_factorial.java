import java.util.Scanner;
 public class FindNumber{
    public static void main(String args[]){
         Scanner in=new Scanner(System.in);
         int count=0;
         int n=in.nextInt();         
         if(n>0){
             for(int i=1;i<=n;i++){
                 if(n%i==0){
                     n=n/i;
                     count=count+1;
                 }
                 else{
                     break;
                 }}     
                 if(n==1){
                      System.out.print(count);
                 }else{
                     System.out.print("Sorry.The given number is not a perfect factorial");
                 }
             }else if(n<=0)
             {
                 System.out.print("Invalid Input");
             }         
     }
 }
