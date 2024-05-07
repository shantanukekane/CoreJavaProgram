package practice_sessions;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
		int num,count=0;
		
		System.out.print("Enter any Digits: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.print(count);


	}

}
