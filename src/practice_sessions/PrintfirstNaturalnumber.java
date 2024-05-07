package practice_sessions;

import java.util.Scanner;

public class PrintfirstNaturalnumber {

	public static void main(String[] args) {
		// Natural Number start from 1  and whole Number start from 0
		int num;
		
		System.out.print("Enter No.of terms: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			
			System.out.print(i+"  ");
			
		}
		
		
		
		
		
		
		
		

	}

}
