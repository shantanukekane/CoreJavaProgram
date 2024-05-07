package practice_sessions;

import java.util.Scanner;

public class Factorial_Numbers {

	public static void main(String[] args) {
		
		// input -----> 7 ------> 7*6*5*4*3*2*1
	   
		int num,fact = 1;
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		for(int i = 1;i<=num;i++)
		{
			fact = fact * i;
		}
		System.out.print(fact);


	}

}
