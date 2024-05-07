package practice_sessions;

import java.util.Scanner;

public class CopyArrayElements {

	public static void main(String[] args) {
		
		
		int a[] = new int[5];
		int b[] = new int[5];
		
		System.out.print("Enter Elements in Arrays: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.print("First array Elements are: ");
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.print("\nSecond Array Elements are : ");
		
		for(int i = 0;i<a.length;i++)
		{
			b[i] = a[i];
			System.out.print(b[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
