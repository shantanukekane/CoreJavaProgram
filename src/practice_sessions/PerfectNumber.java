package practice_sessions;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		// input ==== 6 ===== 1 + 2 + 3
		
		int n,sum = 0;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
	
		for(int i = 1;i<n;i++)
		{
			if(n%i==0)
			{
				sum = sum + i;
			}
		}
		
		if(n==sum)
		{
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
