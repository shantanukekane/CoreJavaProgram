package day5;

import java.util.Scanner;

public class Factors_of_Numbers {

	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		for(int i = 1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i+" ");
			}
		}
		
		

	}

}
