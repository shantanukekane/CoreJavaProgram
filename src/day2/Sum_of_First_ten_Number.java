package day2;

import java.util.Scanner;

public class Sum_of_First_ten_Number {

	public static void main(String[] args) {
		
		
		int num;
		
		int sum = 0;
		
		System.out.print("Enter the Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		if(num%2==0)
		{
			for(int i = 0;i<=num;i+=2)
			{
				System.out.println("Even Numbers: "+i+" ");
			}
		}
		else
		{
			for(int i = 1;i<=num;i+=2)
			{
				System.out.println("Odd Number: "+i+" ");
			}
		}

	}

}
