package day5;

import java.util.Scanner;

public class Convert_Lowercase_upper {

	public static void main(String[] args) {
		
		char ch,ch2;
		
		System.out.print("Enter any char: ");
		Scanner obj = new Scanner(System.in);
		
		ch = obj.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			ch2 = Character.toLowerCase(ch);
			System.out.print("convert to Lowercase: "+ch2);
		}
		else
		{
			ch2 = Character.toUpperCase(ch);
			System.out.print("convert to uppercase: "+ch2);
		}
		
		

	}

}
