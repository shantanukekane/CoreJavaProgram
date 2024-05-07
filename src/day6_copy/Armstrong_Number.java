package day6_copy;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
	
		// input -------> 153 = (1*1*1 + 5*5*5 + 3*3*3)
		int num,r,c;
		int arm = 0;
		
		System.out.print("Enter any Number: ");
		Scanner  obj = new Scanner(System.in);
		
		num = obj.nextInt();
		
		c = num;
		
		while(num>0)
		{
			r = num%10;
			arm = (r*r*r)+arm;
			num = num/10;
		}
		
		if(c == arm)
		{
			System.out.print("Armstrong Number");
		}
		else
		{
			System.out.print("Not Armstrong Number");
		}
		
		
		
		

	}

}
