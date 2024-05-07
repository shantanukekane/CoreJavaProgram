package day2;

import java.util.Scanner;

public class ASCII_value {

	public static void main(String[] args) {
	
		char ch;
		
		System.out.println("Enter any charcter: ");
		Scanner obj = new Scanner(System.in);
		
		ch = obj.next().charAt(0);
		
		// we have to assign this char value into int
		
		int ascii = ch;                  // here suppose we put char is equal to A is assign to a 
		                           // is nothing nothing but the ASCII values
		System.out.print("ASCII value of "+ ch +" is "+ascii);
		
		
		
		
		
		
		
		

	}

}
