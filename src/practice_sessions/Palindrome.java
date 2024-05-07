package practice_sessions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// input = 121 ========== 121
		
		int n,a=0,r,c;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		c = n;
		
		while(n>0)    // 121>0   12>0  2>0
		{
			
			r = n%10;   // 121%10 = 1  12%10 = 2   2%10 = 1
			a = (a*10)+r;
			n = n/10; //n = 12  n = 2 
		
		}
		if(c == a)
		{
			System.out.print("Number is Palindrome");
		}
		else
		{
			System.out.print("Number is not Palindrome");

		}
		
	}

}
