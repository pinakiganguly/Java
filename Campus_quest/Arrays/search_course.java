import java.util.Scanner;

public class Course {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[] course=new String[20];
		String search_course;
		int n,flag=0;
		System.out.println("Enter no of course:");
		n=sc.nextInt();
		if(n>0){
		System.out.println("Enter course names:");
		
		for(int i=0;i<n;i++){
		    course[i]=sc.next();
		}
		System.out.println("Enter the course to be searched:");
		search_course=sc.next();
    		for(int i=0;i<n;i++){
    		    if(search_course.equals(course[i])){
    		        flag+=1;
    		    }
    		}
    		if(flag!=0){
    		    System.out.println(search_course+" course is available");
    		}
		    else{
		        System.out.println(search_course+" course is not available");
		    }
		}
		else{
		    System.out.println("Invalid range");
		}
	}

}
