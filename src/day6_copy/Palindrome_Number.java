package day6_copy;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		// input -------> 121 -------->o/p -----> 121
		int num = 0,remainder,c,a = 0;
		c = num;  // 121
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		while(num>0)
		{
			
			remainder = num % 10;
			a = (a*10)+remainder; // logic for the palindrome
			num = num/10;
		}
		
		if(c == a)
		{
	    	System.out.print("Number is palindrome");
		}
		else
		{
			System.out.print("Number is not palindrome");
		}
		

	}

}
