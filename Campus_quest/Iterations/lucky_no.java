import java.util.Scanner;

public class LuckyNum {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        int number,rem,sum=0;
        System.out.println("Enter the car no:");
        number=sc.nextInt();
        String str=Integer.toString(number);
        if(str.length()==4){
            while(number!=0){
                rem=number%10;
                sum=sum+rem;
                number/=10;
            }
            if(sum%3==0 || sum%5==0 || sum%7==0){
                System.out.println("Lucky Number");
            }
            else{
                System.out.println("Sorry its not my lucky number");
            }
        }
        else{
            System.out.println(number+" is not a valid car number");
        }
	}

}
