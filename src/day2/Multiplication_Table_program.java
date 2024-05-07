package day2;

import java.util.Scanner;

public class Multiplication_Table_program {

	public static void main(String[] args) {
		
		
		int num,squared;
	
		System.out.println("Enter any Program: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			squared = num*i;
			System.out.println(num+"x"+i+":"+squared);					
		}
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
