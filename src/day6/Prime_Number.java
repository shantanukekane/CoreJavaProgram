package day6;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// input ------> 7 ----> prime numbers i.e prime number is divisible by itself and one
		
		int num,count = 0;
		
		System.out.print("Enter any Number: ");
		Scanner obj = new Scanner(System.in);
		
		num = obj.nextInt();
		
		for(int i = 1;i<=num;i++)
		{
			if(num%i==0)
			{
			     count++;	 // num = 7 === > 1,7 like that
			}
		}
		if(count==2)  // why count == 2 , prime number is only divisible by two number 1 and number itself
		{
			System.out.print("prime Number");
		}
		else
		{
			System.out.print("Not prime Number");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
