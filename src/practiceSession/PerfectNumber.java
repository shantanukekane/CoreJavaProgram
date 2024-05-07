package practiceSession;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		// input ===== 6 == 1 2 3 = 6
		int num;
		int sum = 0;
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		num=sum;
		
		for(int i = 1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum = sum + i;
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
