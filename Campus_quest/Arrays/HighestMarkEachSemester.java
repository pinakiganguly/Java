import java.util.Scanner;
public class HighestMarkPerSem{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter no of semester:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    System.out.println("Enter no of subjects in "+(i+1)+" semester:");
		    arr[i]=sc.nextInt();
		}
		int maxMarks[]=new int[n];
		
		for(int i=0;i<n;i++){
		    System.out.println("Marks obtained in semester "+(i+1)+":");
		    int max=sc.nextInt();
		    if(max<0 || max>100){
		        System.out.println("You have entered invalid mark.");
		        System.exit(0);
		    }
		    for(int j=1;j<arr[i];j++){
		        int marks=sc.nextInt();
		        if(marks<0 || marks>100){
    		        System.out.println("You have entered invalid mark.");
    		        System.exit(0);
		        }
		        if(max<marks)
		        max=marks;
		    }
		    maxMarks[i]=max;
		}
		for(int i=0;i<n;i++){
		    System.out.println("Maximum mark in "+(i+1)+" semester:"+maxMarks[i]);
		}
    }
    
}
