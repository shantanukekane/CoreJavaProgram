package day6;

import java.util.Scanner;

public class Check_Perfect_Number {

	public static void main(String[] args) {
		
		//input ----------> 8 
		// 8 ------------ 1 2 4 ------- 1 + 2 + 4 = 7 not a perfect Number
		
		int num,sum=0;
		
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
			System.out.print("perfect Number");
		}
		else
		{
			System.out.print("Non perfect Number");
		}
		

	}

}
