package day6;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {

		int num, c,r;
		int a = 0;
		System.out.println("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt(); // 141
		
		c = num ; // c = 141
		while(num>0)
		{
			r = num%10;
			a = (a*10)+r;
			num = num/10;
		}
		
		if(c == a)
		{
			System.out.print("Number is Palindrome");
		}
		else
		{
			System.out.print("Number is Not Palindrome");	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
