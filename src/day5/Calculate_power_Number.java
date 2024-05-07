package day5;

import java.util.Scanner;

public class Calculate_power_Number {

	public static void main(String[] args) {
		
		// n= 5
		// p = 2  , 5*5 = 25
		
		
		int num,power;
	    int result = 1;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		System.out.println("Enter any power: ");
		
		power = s.nextInt();
		
		for(int i = 1;i<=power;i++)  // 
		{
			result = result*num;  // 5*1 = 5 , 5*5 = 25, 25*5 = 125
		}
		System.out.print(result);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
