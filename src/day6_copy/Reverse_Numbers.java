package day6_copy;

import java.util.Scanner;

public class Reverse_Numbers {

	public static void main(String[] args) {
		
		int num,r; // 121 
		
		System.out.print("Enter Your Number: ");
		Scanner obj = new Scanner(System.in);
		
		num = obj.nextInt();
		
		while(num>0)   // 121>0   , 12>0 , 2>0
		{
			r = num%10;  // 121 % 10 = 1,  12 % 10 = 2, 
			System.out.print(r); 
			num = num/10; // num = 12 , 2
		}
		

		
		
		
		
		
		
		
		
		
		
	}

}
