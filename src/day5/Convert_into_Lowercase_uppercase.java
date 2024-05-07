package day5;

import java.util.Scanner;

public class Convert_into_Lowercase_uppercase {

	public static void main(String[] args) {
		
		
		char ch,ch2;
		System.out.print("Enter any char: ");
		Scanner s = new Scanner(System.in);
		
		ch = s.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			ch2 = Character.toLowerCase(ch);
			System.out.println("Lowercase: "+ch2);
		}
		else
		{
			ch2 = Character.toUpperCase(ch);
			System.out.println("Uppercase: "+ch2);
		}
		}
		
			
		

	}


