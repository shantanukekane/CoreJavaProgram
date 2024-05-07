package day6_copy;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
	
		// input  ------> 123 ------ (1 + 2 + 3 ) = 6
		
		int num,r;
		int sum = 0;
		
		System.out.print("Enter any Number: ");
		Scanner obj  = new Scanner(System.in);
		
		num = obj.nextInt();
		
		while(num>0)
		{
			r = num%10;
			sum = sum + r;
			num = num/10;
		}
		System.out.println("sum of digits: "+sum);		
		
		
		
		
		
		
		
		
		
		
		

	}

}
