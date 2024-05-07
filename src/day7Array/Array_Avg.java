package day7Array;

import java.util.Scanner;

public class Array_Avg {

	public static void main(String[] args) {
		
		
		int a[] = new int[5];
		int sum = 0;
		double avg;
		
		System.out.print("Enter Elements in array: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			sum = sum + a[i];
		}
		System.out.print("\naddition of array Elements: "+sum);
		
		avg = sum/a.length;
		
	   System.out.print("\nAverage of all array Elements: "+avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
