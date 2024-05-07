package practice_sessions;

import java.util.Scanner;

public class ReversedNumber {

	public static void main(String[] args) {
		
		
		int num,r;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		while(num>0)  // 153>0   15>0
		{
			r = num%10;  // 153%10 = 3 , 15%10 = 5
			System.out.print(r); // 3  5  1
			num = num/10; // 15  
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
