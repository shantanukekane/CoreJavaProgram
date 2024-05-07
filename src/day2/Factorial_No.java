package day2;

import java.util.Scanner;

public class Factorial_No {

	public static void main(String[] args) {
		// factorial = 5*4*3*2*1
		int num;
		int fact = 1;
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		for(int i=1;i<=num;i++)  // 1 2 3 4 5 
		{
		   fact = fact * i;	 // 1x1 1x2 2x3 3x4 4x5
		}
		System.out.println(fact);
		
		
		
		
		
		
		

	}

}
