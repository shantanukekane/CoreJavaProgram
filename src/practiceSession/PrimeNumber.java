package practiceSession;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// input ===== 7 === 1 7
		int num,count= 0;
		
		System.out.print("Enter Any Number: ");
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
