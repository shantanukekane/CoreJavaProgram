package day7Array;

import java.util.Scanner;

public class Array_Element_print_reverse_order {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		System.out.print("Enter Element in an array: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.print("Array Elements: ");
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.print("\nReverse Array Elements: ");
		
		for(int i = a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
		

	}

}
