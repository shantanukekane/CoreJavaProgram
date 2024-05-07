package day7Array;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		// prime number --------> 7 -------------> number which is divisible by 1 and itself 
		
		int num,count= 0;
		
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
		if(count==2)
		{
			System.out.print("Prime Number");
		}
		else
		{
			System.out.print("Not Prime Number");
		}
		

	}

}
