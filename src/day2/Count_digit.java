package day2;

import java.util.Scanner;

public class Count_digit {

	public static void main(String[] args) {
		// count = 256454661243325667856

		int num;
		int cnt = 0;
		
		System.out.println("Enter any Program: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		while(num>0) 
		{
			num = num/10;
			cnt++;
		}
		System.out.println("Number of digits to count: "+cnt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
