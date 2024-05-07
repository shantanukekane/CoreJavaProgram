package day7Array;

import java.util.Scanner;

public class Array_reverse_program {

	public static void main(String[] args) {
		
		int b[] = new int[6];
		
		System.out.print("Enter any Array Element: ");
		Scanner obj = new Scanner(System.in);
		
		for(int i = 0;i<b.length;i++)
		{
			b[i] = obj.nextInt();
		}
		
		System.out.print("Array Elements are: ");
		
		for(int i = 0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		System.out.print("\nReverse Array Elements are: ");
		
		for(int i = b.length-1;i>=0;i--)
		{
			
			System.out.print(b[i]+" ");
			
		}
		

	}

}
