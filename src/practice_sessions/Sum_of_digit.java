package practice_sessions;

import java.util.Scanner;

public class Sum_of_digit {

	public static void main(String[] args) {
		
		// i/p = 121 ===== 1+2+1;
		int num,r,sum=0;

		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
	    while(num>0) // 121>0 12>0
	    {
	    	r = num%10;  // 121%10 = 1  2  1
	    	sum = sum + r;
	    	num = num/10; // n = 12 
	    	
	    }
		System.out.print(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
