package day7Array;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		// input  121 --------->121
		
		int num,r,c,a=0;
	
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		c = num;
		
		while(num>0)
		{
			
			r = num%10;  // 121%10 = 1 
			a = (a*10)+r; // 
			num = num/10; // 
			
		}
		
		if(c == a)
		{
			System.out.print("Palindrome Number");
		}
		else
		{
			System.out.print("Not Palindrome Number");

		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
