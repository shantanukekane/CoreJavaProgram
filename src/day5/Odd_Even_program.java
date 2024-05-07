package day5;

import java.util.Scanner;

public class Odd_Even_program {

	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		if(n%2==0)
		{
			System.out.print("Even Number: "+n);
		}
		else
		{
			System.out.print("Odd Number: "+n);

		}
		
		
		
		
		
		
		
		

	}

}
