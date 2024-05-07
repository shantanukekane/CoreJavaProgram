package practice_sessions;

import java.util.Scanner;

public class Power_of_Number {

	public static void main(String[] args) {
		
		// input 3 = 3*power2 = 3*2 = 9
		
		int num,power;
		int result = 1;
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		System.out.print("Enter any power: ");
		
		power = s.nextInt();
		
		for(int i = 1;i<=power;i++)
		{
			
			result = num*result;
			
		}
		System.out.print(result);

	

	}

}
