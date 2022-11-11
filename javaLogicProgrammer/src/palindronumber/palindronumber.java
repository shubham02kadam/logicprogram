package palindronumber;

public class palindronumber {

	
	public static void main(String[] args) {
		int num=1234;
		int org=num;
		
		int rev=0;
		
		while(num!=0) {
			
			rev =rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
		
		if(org==rev) {
			
			System.out.println("palindro number");
		}
		
		else {
			
			System.out.println("not palindro number");
			
		}
		
		
		
	}
	
}
