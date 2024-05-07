package practiceSession;

import java.util.Scanner;

public class PalindriomeNumbers {

	public static void main(String[] args) {
		
		// input ======= 919 == ===> 919
		int num,r,c,a=0;
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		c = num;
		
		while(num>0) // 121>0   12>0  1>0
		{
			r = num%10;   //  121%10 = 1   12%10=2 1%10        
		    a = (a*10)+r;  // a = (0*10) + 1 = 1 * 10+2 = 12 = 12*10+1 = 121
		    num = num/10; // 12,1 
		}
		if(c==a)
		{
			System.out.print("Palindrome Number: "+a);
		}
		else
		{
			System.out.print("Not Palindrome Number: "+a);
		}
		
		
		
		

	}

}
