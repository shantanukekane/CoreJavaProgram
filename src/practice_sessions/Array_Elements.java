package practice_sessions;

import java.util.Scanner;

public class Array_Elements {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		System.out.print("Enter Elements in a Array: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}

		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("length of an array is: "+a.length);
		
		
		
		
		

	}

}
