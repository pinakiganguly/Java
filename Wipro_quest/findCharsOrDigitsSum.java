package Questions;

class sum{
	String findsum(String input1,int input2) {
		 StringBuffer alpha = new StringBuffer(),num = new StringBuffer();
		 String input3=input1;int m,sum=0;
		 if(input2==0) {
			 input1 = input1.replaceAll("[^\\d]", " ");
			 input1 = input1.trim();
			 int i=Integer.parseInt(input3);
			 while(i>0) {
				 m=i%10;
				 sum=sum+m;
				 i=i/10;
			 }
			 return String.valueOf(sum);
		 }
		 else if(input1.equals("")) {
				 return "NULL";
			 }
		 
		 
		 
		return input1;
	}
}

public class findCharsOrDigitsSum {
	/*static String extractInt(String str) 
    { 
        // Replacing every non-digit number 
        // with a space(" ") 
        str = str.replaceAll("[^\\d]", " "); 
  
        // Remove extra spaces from the beginning 
        // and the ending of the string 
        str = str.trim(); 
  
        // Replace all the consecutive white 
        // spaces with a single space 
       // str = str.replaceAll(" +", " "); 
  
        if (str.equals("")) 
            return "-1"; 
  
        return str; 
    }*/ 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "1wi23";
        sum s=new sum();
        System.out.println(s.findsum(str, 0));
        //System.out.print(extractInt(str)); 
    }  
} 

