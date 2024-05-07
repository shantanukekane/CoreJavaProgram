package day5;

import java.util.Scanner;

public class ASCII_value {

	public static void main(String[] args) {
		// ASCII value is american standart cond information 
		
		  char ch;
		  
		  System.out.print("Enter any char value: ");
		  Scanner s = new Scanner(System.in);
		  
		  ch = s.next().charAt(0);
		
		int num = ch;  //   num = 64 ,ASCII value of A is 65
		
		System.out.println(num);
		
		

	}

}
