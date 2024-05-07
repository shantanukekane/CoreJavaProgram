package day5;

import java.util.Scanner;

public class Factor_of_Numbers {

	public static void main(String[] args) {
		
		// factors of numbers 
		
		// inputs ----- 10 ----> 1 2 5 10
		// inputs ------5 ----> 1 5
		
		int num;     // 20
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		for(int i = 1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}
		

	}

}
