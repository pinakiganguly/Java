package Questions;

class vowels{
	public String conversion(String input1) {
		//String str1=input1.toUpperCase();
		
		String str[]=input1.split(",");
		for(int i=0;i<str.length;i++) {
			if(str[i].startsWith("A") || str[i].startsWith("E")|| str[i].startsWith("I") || str[i].startsWith("O") || str[i].startsWith("U")) {
				if(str[i].endsWith("a") || str[i].endsWith("e") || str[i].endsWith("i") || str[i].endsWith("o") || str[i].endsWith("u"))
						input1=str[i];
				String input2=input1.toLowerCase();
				System.out.print(input2);
				
			}
		}
					
			return input1;
		}
	}
	public class vowelRecog {
		public static void main(String args[]) {
			vowels v=new vowels();
			//String v1;
			v.conversion("Apple,Rice,Ace,King,Oreo");
			//System.out.println(v1);
		}
	}

