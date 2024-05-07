package day6;

import java.util.Scanner;

public class PrimeNumberBetweenTwoNumber {

	public static void main(String[] args) {
		
		// input first number = 10
		// input second number = 20
		
		// prime number ---------> 11,13,17,19
		
		
		int n1,n2,count=0;
		int i,j;
		System.out.print("Enter Two Numbers: ");
		Scanner obj =new Scanner(System.in);
		
		n1 = obj.nextInt();
		n2 = obj.nextInt();
		
		for(i = n1;i<n2;i++)
		{
			for(j=2;j<=i;j++)
			{
				
				if(i%j==0)
				 break;
				
			}
			if(i==j)
			{
				System.out.print(j+" ");
			}
		}
		

	}

}
