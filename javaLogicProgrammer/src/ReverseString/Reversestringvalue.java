package ReverseString;

public class Reversestringvalue {
	
	public static void main(String[] args) {
		
		String s= "charan";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			System.out.print(s.charAt(i));
		}
		
		StringBuffer sb= new StringBuffer(s);
		
		
		
		System.out.print(sb.reverse());
		
		
		
	}

}
