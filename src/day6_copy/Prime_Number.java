package day6_copy;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		// input -------> prime number of not 
		
		
		int num,count=0;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		for(int i = 1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		if(count==2)  // bcoz = prime number is divisible by only two numbers
		{
			System.out.print("Number is prime Number");
		}
		else
		{
			System.out.print("Number is not prime Number");
     
		}
		
		
		

	}

}
