package practiceSession;

import java.util.Scanner;

public class SumOftwoNumber {

	public static void main(String[] args) {

		int num,sum = 0;
		System.out.println("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		for(int i = 1;i<=num;i++)
		{
			sum = sum + i;    
			//System.out.print(i+" ");
		}
		System.out.print(sum+" ");

		
		
		
		
		
		
		
		
		

	}

}
