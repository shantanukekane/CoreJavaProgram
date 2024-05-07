package day6;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
	
		// input number = 153 ------------> (1*1*1 + 5*5*5 + 3*3*3 = 153) ------> Armstrong Number
		
		int num,remainder;
		int arm = 0;
		System.out.print("Enter any Number: ");
		Scanner obj = new Scanner(System.in);
		
		num = obj.nextInt();  // 198
		int c = num;
		
		while(num>0)
		{
			remainder = num%10;
			arm = (remainder*remainder*remainder) + arm;
			num = num/10;
			
		}
		 
		if(c == arm)
		{
			System.out.print("Number is Armstrong");
		}
		else
		{
			System.out.print("Number is not Armstrong");
		}
		
		
		

	}

}
