package day1;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
	
		int a;
		double b;
		double c;
		double d;
		
		System.out.println("Enter any Two Number: ");
		// Scanner class we used for the runtime input 
		Scanner s = new Scanner(System.in);
		
		a = s.nextInt();
		b = s.nextDouble();
		
		c = a + b;
		d = a * c;
		
		System.out.println("Sum of Two Numbers: "+c);
		System.out.println("multiplication of two Numbers: "+d);
		

	}

}
