package day4;

import java.util.Scanner;

public class Swapping_No_without_Third_variable {

	public static void main(String[] args) {
		
		// Swapping of two number without third variable
		
		int a,b;
		
		System.out.println("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		a = s.nextInt();
		b = s.nextInt();
		
		System.out.println("Before swapping: "+a+" "+b); // 10 20
		
		a = a + b; //a = 10+20 = 30
		b = a - b; //b = 30-20 = 10 
		a = a - b; //a  = 30 - 10 = 20
		
		System.out.println("After swapping: "+a+" "+b); // 20 10

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
