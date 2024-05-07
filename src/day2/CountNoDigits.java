package day2;

import java.util.Scanner;

public class CountNoDigits {

	public static void main(String[] args) {
		
		// input 3465 ------> 4
		int n;
		int count = 0;
		
		System.out.print("Enter any Number: ");
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		while(n>0)
		{
			n = n/10;
			count++;
		}
		System.out.print("Total Number of digits: "+count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
