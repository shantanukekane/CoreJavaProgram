package day2;

import java.util.Scanner;

public class Calculate_Power_of_Number {

	public static void main(String[] args) {
		
		
		int num;
		int power,result = 1;
		
		System.out.print("Enter any Number: ");
		
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		System.out.print("Enter power: ");
		power = s.nextInt();

		for(int i = 1;i<=power;i++)  // 1 2 3
		{
		   result =	result*num;  //  10  100 1000
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
