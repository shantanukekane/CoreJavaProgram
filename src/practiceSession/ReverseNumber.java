package practiceSession;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		// Input ====> 123
		int num,r;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		while(num>0)
		{
			
			r = num%10;
			System.out.print(r+" ");
			num = num/10;
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
