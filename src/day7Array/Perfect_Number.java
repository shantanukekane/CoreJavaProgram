package day7Array;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		
		// input 6 ========== 1 2 3 =========== 1 + 2 + 3 = 6
		int num,sum = 0;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		for(int i = 1;i<num;i++) // 1 2 3 4 5
		{
			if(num%i==0)  // 1 2 3
			{
				sum = sum + i;  // 
			}
		}
		
		if(num == sum)
		{
			System.out.print("Perfect Number");
		}
		else
		{
			System.out.print("Not a Perfect Number");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
