package day5;

import java.util.Scanner;

public class Print_Odd_Number {

	public static void main(String[] args) {
		
		
		int num;
		
		System.out.println("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		for(int i = 1;i<=num;i+=2)
		{
			System.out.println("odds Numbers are: "+i);
		}
		
		
		
		
		
		

	}

}
