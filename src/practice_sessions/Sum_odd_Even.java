package practice_sessions;

import java.util.Scanner;

public class Sum_odd_Even {

	public static void main(String[] args) {
		
		int n,sum = 0;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		if(n%2==0)
		{
			for(int i = 0;i<=n;i+=2)
			{
				sum = sum + i;
			}
			System.out.print("addition of Even Numbers: "+sum);
		}
		else
		{
			for(int i = 1;i<=n;i+=2)
			{
				sum = sum + i;
			}
			System.out.print("addition of odd Numbers: "+sum);

		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
