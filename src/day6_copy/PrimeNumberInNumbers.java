package day6_copy;

import java.util.Scanner;

public class PrimeNumberInNumbers {

	public static void main(String[] args) {
	
		int num1,num2;
		int i,j;
		System.out.print("Enter two Number:");
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		for(i=num1;i<num2;i++)
		{
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
				break;
			}
			if(i==j)
			System.out.print(j+" ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
