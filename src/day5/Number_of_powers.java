package day5;

import java.util.Scanner;

public class Number_of_powers {

	public static void main(String[] args) {
		
		
		int num,power,result = 1;
		
		System.out.print("Enter any number: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		System.out.print("Enter any Power: ");
		power = s.nextInt();
		
		for(int i = 1;i<=power;i++)
		{
			result = result*num;  
		}
		System.out.print(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		;
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
