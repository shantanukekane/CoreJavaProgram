package practice_sessions;

import java.util.Scanner;

public class CharconvertintoUpperLower {

	public static void main(String[] args) {
		
		char ch,ch2;
		
		System.out.print("Enter any Chars: ");
		Scanner s = new Scanner(System.in);
		
		ch = s.next().charAt(0);
		
		if(ch>='A'&& ch<='Z')
		{
		   ch2 = Character.toLowerCase(ch);
		   System.out.print(ch2);
		}
		else
		{
			ch2 = Character.toUpperCase(ch);
			   System.out.print(ch2);
		}
		
		
		

	}

}
