package day7Array;

import java.util.Scanner;

public class Copy_array {

	public static void main(String[] args) {
		
		
		int num1[] = new int[4];
		
		int num2[] = new int[4];
		
		
		System.out.print("Enter Elements in array:");
		Scanner obj = new Scanner(System.in);
		
		for(int i = 0;i<num1.length;i++)
		{
			num1[i] = obj.nextInt();
		}
		
		System.out.print("Array Elements are in first array: ");
		
		for(int i = 0;i<num1.length;i++)
		{
			System.out.print(num1[i]+" ");
		}
		
		System.out.print("\nArray Elements are in second array: ");
		
		for(int i = 0;i<num1.length;i++)
		{
			num2[i] = num1[i];
			System.out.print(num2[i]+" ");
		}
		
		

	}

}
