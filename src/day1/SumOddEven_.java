package day1;

import java.util.Scanner;

public class SumOddEven_ {

	public static void main(String[] args) {
		
		
		int num;
		int sum = 0;
		
		System.out.println("Enter any Number: ");
		Scanner obj = new Scanner(System.in);
		
		num = obj.nextInt();
		
		if(num%2==0)  // condition
		{
			for(int i = 0;i<=num;i+=2)
			{
				sum = sum + i;
				//System.out.println("Addition of Even Number: "+sum);
			}
			System.out.println("Addition of Even Number: "+sum);

		}
		else
		{
			for(int i = 1;i<=num;i+=2)
			{
				sum = sum + i;

			}
			System.out.println("Addition of odd Number: "+sum);

		}
		
		
		
		
		
		
		

	}

}
