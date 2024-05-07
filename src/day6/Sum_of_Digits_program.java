package day6;

import java.util.Scanner;

public class Sum_of_Digits_program {

	public static void main(String[] args) {
		
		int num,r;  // num = 2564
		int sum = 0;
		System.out.print("Enter any Number: ");
		Scanner obj = new Scanner(System.in);
		
		num = obj.nextInt();
		
		while(num>0) // num>2564 ,
		{
			r = num%10;
			sum = sum + r;
			num = num/10;
		}
		System.out.print("sum of digits: "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
