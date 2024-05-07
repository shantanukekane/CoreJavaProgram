package day7Array;

import java.util.Scanner;

public class Copy_Entire_Array {

	public static void main(String[] args) {
		
		
		int a[] = new int[5];
		int b[] = new int[5];  // [7]
		
		
		System.out.print("Enter Elements in array: ");
		Scanner obj = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = obj.nextInt();
		}
		
		System.out.print("Array Elements in first array:");
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.print("\nCopy Array Elements in second array:");

		for(int i = 0;i<a.length;i++)
		{
			b[i] = a[i];
			System.out.print(b[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
