package day7Array;

import java.util.Scanner;

public class Reversed_Numbers {

	public static void main(String[] args) {
		
		// input 123 --------------------> 321
		
		int num,r;
		
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		
		num = s.nextInt();
		
		while(num>0)   // 123>0 , 12> 0; 
		{
			r = num%10; // 123%10 =  3, 12%10 = 2,and so on till the end 
			System.out.print(r); //
			num = num/10; // 12
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
