package day5;

import java.util.Scanner;

public class Leap_Year_program_1 {

	public static void main(String[] args) {
		
		// conditions 1 = y%100==0 and y%400==0
		// conditions 2 = y%100!=0 and y%4==0;
		
		int y;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		y = s.nextInt();
		
		if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
		{
			System.out.print("its a leap year");
		}
		else
		{
			System.out.print("its not a leap year");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
