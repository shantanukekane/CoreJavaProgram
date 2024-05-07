package practice_sessions;

import java.util.Scanner;

public class Addition_of_Array {

	public static void main(String[] args) {

		int a[] = new int[5];
		int sum = 0;
		
		System.out.print("Enter Elements in an Array: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			
			a[i] = s.nextInt();
			
		}
		
		System.out.print("Array Elements: ");
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			sum = a[i] + sum;
		}
		System.out.print("\nAddition of array Elements are: "+sum);
	
		
		
		
		

	}

}
