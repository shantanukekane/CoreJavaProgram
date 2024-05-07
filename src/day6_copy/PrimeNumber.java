package day6_copy;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num,count=0;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);

		num = s.nextInt();
		
		for(int i = 1;i<=num;i++)
		{
			if(num%i==0)  // 29%1, 29%29
			{
				count++;  // prime number = 7 , which is divisible by 1 and 7 itself
			}
		}
		if(count == 2)  // count = 1,7 = 2
		{
		    System.out.print("Prime Number");
		}
		else
		{
			System.out.print("Not Prime Number");
		}
		

	}

}
