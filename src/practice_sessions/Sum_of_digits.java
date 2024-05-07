package practice_sessions;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		
		
		
		int num,sum = 0,r;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		
		while(num>0)  // 12345>0
		{
			r = num%10; 
			sum = sum + r;
			num = num/10;
		}
		System.out.print(sum);
		
		
		
		

	}

}
