package day6;

import java.util.Scanner;

public class Factor_of_Numbers {

	public static void main(String[] args) {
		
		//inputs ------> 10 -----> 1 2 5 10
		
		int num;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		for(int i = 1;i<=num;i++)           // 
		{
			
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
