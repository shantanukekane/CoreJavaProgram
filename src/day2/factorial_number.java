package day2;

import java.util.Scanner;

public class factorial_number {

	public static void main(String[] args) {
		
	// input n = 5*4*3*2*1;
		
		int n,fact = 1;
		System.out.println("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		for(int i = 1;i<=n;i++) // 1 2 3 4 
		{
			fact = fact * i; // 1x1 1x2 2x3 3x4 = 24
		}
		System.out.print(fact);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
