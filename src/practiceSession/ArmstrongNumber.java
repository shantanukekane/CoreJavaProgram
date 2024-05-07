package practiceSession;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//input 153 ======== 1*1*1+5*5*5+3*3*3 ======== 153
		int num,r,c,arm = 0;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		c = num;
		while(num>0)
		{
			
			r = num%10;
			arm = (r*r*r)+arm;
			num = num/10;
		}
		if(c==arm)
		{
			System.out.print("Armstrong Number");
		}
		else
		{
			System.out.print("Not Armstrong Number");
		}
		
		
		
		
		
		

	}

}
