package day2;

import java.util.Scanner;

public class IdentiftyVowels_Consonants {

	public static void main(String[] args) {
		
		char ch;
		System.out.print("Enter any Character: ");
		Scanner obj = new Scanner(System.in);
		
		ch = obj.next().charAt(0);
		
	    // conditions to search vowels and consonants
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("char is vowels");
		}
		else
		{
			System.out.println("char is consonants");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
