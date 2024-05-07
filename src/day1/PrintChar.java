package day1;

import java.util.Scanner;

public class PrintChar {

	public static void main(String[] args) {
		// suppose i want to print any single character
		char ch;
		
		System.out.println("Enter any Char:");
		
		Scanner obj = new Scanner(System.in);
		
		ch = obj.next().charAt(0);   // char is nothing but the String we use next.charAt()
		
		System.out.print(ch);
		
		
		
		
		
		

	}

}
