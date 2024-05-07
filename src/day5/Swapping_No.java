package day5;

import java.util.Scanner;

public class Swapping_No {

	public static void main(String[] args) {
		
		int a,b;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		a = s.nextInt(); // 200
		b = s.nextInt(); //100
		
		System.out.println("Before swaping: "+a+" "+b);
		
		a = a + b; // a = 200 +100 = 300
		b = a - b; // b = 300 - 100 = 200
		a = a - b; // a = 300 - 200 = 100
		
		
		System.out.println("After swaping: "+a+" "+b);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
