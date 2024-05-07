package day7Array;

import java.util.Scanner;

public class Sum_of_Array_Elements {

	public static void main(String[] args) {
	
		
		int a[] = new int[5];
		int sum = 0;
		
		System.out.print("Enter Elements in Array:  ");
		Scanner obj = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			
			a[i] = obj.nextInt();
			
		}
		
		for(int i = 0;i<a.length;i++)
		{
			
			System.out.print(a[i]+" ");
			sum = sum + a[i];
			
		}
		System.out.print("\nAddition of array:"+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
