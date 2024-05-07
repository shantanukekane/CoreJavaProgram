package day6;

public class Sum_of_digit_Program {

	public static void main(String[] args) {
		
		// input 146 -----> 1 + 4+6 = 11
		
		int num = 146,r;
	    int sum = 0;
		
		while(num>0)  // 146> 0
		{
			r = num%10;    // 146%10 = 6; 14%10 = 4, 1%10 = 1
			sum = sum + r; // 0 + 6 + 4 + 1 = 11
			num = num/10;  // 
		}
		System.out.print("sum of digits: "+sum);
			
		
		
		
		
		
		
		
		

	}

}
