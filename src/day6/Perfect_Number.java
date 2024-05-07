package day6;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
	//input 6 -------> 1 2 3 4 5 
		// 6 -----> 1 2 3  (1+2+3) = 6
		
		int num,sum = 0;
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		
		num = s.nextInt();
		
		for(int i = 1;i<num;i++)
		{
			
			if(num%i==0)
			{
				sum = sum + i;
			}
			
		}
		
		if(num == sum)
		{
			System.out.print("Number is Perfect Number");
		}
		
		else
		{
			System.out.print("Number is Not Perfect Number");
		}
		
	

	}

}
