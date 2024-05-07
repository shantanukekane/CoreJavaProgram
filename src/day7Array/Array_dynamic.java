package day7Array;

import java.util.Scanner;

public class Array_dynamic {

	public static void main(String[] args) {
		
		int size,i;
		
		System.out.print("Enter size Numbers: ");
		Scanner s = new Scanner(System.in);
		
		size = s.nextInt();
		
		int a[] = new int[size];
		
		for(i = 0;i<size;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("Printed Array Element"+" ");
		
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]);
		}
		

	}

}
