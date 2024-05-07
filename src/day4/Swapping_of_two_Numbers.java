package day4;

import java.util.Scanner;

public class Swapping_of_two_Numbers {

	public static void main(String[] args) {
		
		
		
		int a,b;
		System.out.println("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		a = s.nextInt();
		b = s.nextInt();
		
		System.out.println("Swapping of two Numbers: "+a+" "+b);
        
		a = a + b;  //a =  200 + 400 = 600
		b = a - b; // b = 600 - 400 = 200
        a = a - b; // a  = 600 - 200 = 400		
		
		
		
		
		
		
		
		
		
		
		

	}

}
