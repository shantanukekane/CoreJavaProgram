package practice_sessions;

import java.util.Scanner;

public class Factor_of_Number {

	public static void main(String[] args) {
		
		
		// input =====10 ========= 1 2 5 10 factor of Number
		
		int num;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		for(int i = 1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+"  ");
			}
				
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
