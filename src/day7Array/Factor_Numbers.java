package day7Array;

import java.util.Scanner;

public class Factor_Numbers {

	public static void main(String[] args) {
		
		// input 10 --------------> 1 ,2,5,10
		int num,count=0;
		
		System.out.println("Enter any Numbers: ");
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
