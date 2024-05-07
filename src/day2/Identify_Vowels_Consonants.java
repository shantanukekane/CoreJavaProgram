package day2;

import java.util.Scanner;

public class Identify_Vowels_Consonants {

	public static void main(String[] args) {
		
		
		char ch;
		System.out.print("Enter any char: ");
		Scanner s = new Scanner(System.in);
		
		ch = s.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.print("This char is vowels");
		}
		else
		{
			System.out.println("This char is consonants");
		}
	

	}

}
