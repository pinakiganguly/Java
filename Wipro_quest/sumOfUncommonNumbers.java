package Questions;

class find_Sum_of_Uncommon_Numbers{
	int UncommonNumbers(int input1[],int input2[]) {
		int sum=0,flag=0,sum1=0;
		for(int i=0;i<input1.length;i++) {
			//System.out.println(input1[i]);
			for(int j=i;j<input2.length;j++) {
				if(input1[i]!=input2[j]) {
					for(int k=0;k<input1.length;k++) {
						if(input2[j]==input1[k]) {
							flag=1;
							break;
						}
						else
							flag=0;
					}
//					flag=1;
//					break;
					//System.out.println(input2[j]);
					if(flag==0) {
						sum+=input2[j];
					}
					//System.out.println("sum="+sum);
				}
				//break;
				//i=1;
			}
			i=1;
			if(i==1)
				break;
		}
		
		//Changing Two Arrays
		
		
		for(int i=0;i<input2.length;i++) {
			//System.out.println(input1[i]);
			for(int j=i;j<input1.length;j++) {
				if(input2[i]!=input1[j]) {
					for(int k=0;k<input2.length;k++) {
						if(input1[j]==input2[k]) {
							flag=1;
							break;
						}
						else
							flag=0;
					}
//					flag=1;
//					break;
					//System.out.println(input1[j]);
					if(flag==0) {
						sum+=input1[j];
					}
					//System.out.println("sum="+sum);
				}
				//break;
				//i=1;
			}
			i=1;
			if(i==1)
				break;
		}

		while (sum > 0 || sum1 > 9)  
        { 
            if (sum == 0) { 
                sum = sum1; 
                sum1 = 0; 
            } 
            sum1 += sum % 10; 
            sum /= 10; 
        }
		/*int m;
		while(sum>0 ) {
			m=sum%10;
			sum1=sum1+m;
			sum=sum/10;
		}*/
		
		return sum1;
	}
}	

public class sumOfUncommonNumbers{
	public static void main(String[] args) 
	{ 
		/*test case 1*/
//	    int arr1[] = {6,7,12,70,44};
//	    int arr2[] = {8,6,70,44};/7+12+8=27/
		
	    /*test case 2*/
//	    int arr1[] = {1,2,3,4,5};
//	    int arr2[] = {1,2,3,5,6};/6+4=10/
	    
		/*test case 3*/
	    int arr1[] = {123,45,7890,67,2,90};
	    int arr2[] = {45,7890,123};/*67+2+90=159*/
	    find_Sum_of_Uncommon_Numbers obj1=new find_Sum_of_Uncommon_Numbers();
	   System.out.println("sum= "+obj1.UncommonNumbers(arr1,arr2));
	} 
}