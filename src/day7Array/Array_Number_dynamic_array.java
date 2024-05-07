package day7Array;

import java.util.Scanner;

public class Array_Number_dynamic_array {

	public static void main(String[] args) {
		
		int size,i;
		
		System.out.print("Enter size Number: ");
		Scanner s = new Scanner(System.in);
		
		size = s.nextInt();
		int a[] = new int[size];
		
		for(i=0;i<size;i++)
		{
			
			a[i] = s.nextInt();
			
		}
		
		System.out.print("Printed Array Element:"+" ");
		
		for(i = 0;i<size;i++)
		{
			
			System.out.print(a[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
