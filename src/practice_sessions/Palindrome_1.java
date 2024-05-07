package practice_sessions;

import java.util.Scanner;

public class Palindrome_1 {

	public static void main(String[] args) {
		// input 121 ===========121
		
		int n,a=0,c,r;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		c = n;
		
		
		while(n>0)
		{
			r = n%10;
			a = (a*10)+r;
			n = n/10;
		}
	
		if(c==a)
		{
			
			System.out.print("Palindrome Number");
			
		}
		else
		{
			System.out.print(" Not Palindrome Number");

		}

	}

}
