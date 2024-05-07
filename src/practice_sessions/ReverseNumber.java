package practice_sessions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		//input --- 123-------321
		
		
		int num,r;
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		while(num>0) // 123 >0 , 12>0 1>0	
		{
			r=num%10; // 123%10 = 3 , 12%10 = 2, 1%10 = 1
			System.out.print(r);
			num = num/10; // n = 12 , n=1
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
