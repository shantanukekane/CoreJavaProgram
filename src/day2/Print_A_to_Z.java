package day2;

import java.util.Scanner;

public class Print_A_to_Z {

	public static void main(String[] args) {
		
		// taking the inputs class 
		char ch;
		
		System.out.print("Enter starting character: ");
		Scanner s = new Scanner(System.in);
		
		ch = s.next().charAt(0);
		
		for(char i = 'A';i<=ch;i++)
		{
			System.out.println(i+" ");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
