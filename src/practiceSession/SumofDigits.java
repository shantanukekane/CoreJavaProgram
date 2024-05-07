package practiceSession;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		
		
		int num,r,sum = 0;
		System.out.print("Enter any number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		while(num>0)
		{
			r = num%10;
			sum = sum + r;
			num = num/10;
		}
		System.out.print(sum+" ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
