package practice_sessions;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		int a[] = new int[5];
		
		System.out.print("Enter Elements in Array Elements: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.print("Array Elements are: ");
		
		for(int i = 0;i<a.length;i++)
		{
		  System.out.print(a[i]+" ");
		}
		
		System.out.print("\nReverse Array Elements are: ");

		for(int i = a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
