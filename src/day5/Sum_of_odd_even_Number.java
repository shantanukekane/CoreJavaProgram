package day5;

import java.util.Scanner;

public class Sum_of_odd_even_Number {

	public static void main(String[] args) {
		
		int num,sum=0;
		
		System.out.println("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		if(num%2==0)
		{
			for(int i = 0;i<=num;i+=2)
			{
				sum = sum + i;
			}
			System.out.print("addition of Even Numbers: "+sum);
		}
		else
		{
			for(int i = 1;i<=num;i+=2)
			{
				sum = sum + i;
			}
			System.out.print("addition of Odd Numbers: "+sum);

		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
