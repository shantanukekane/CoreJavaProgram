package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Array_equals_methods {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		int b[] = new int[5];
		
		System.out.print("Enter Elements in Array Elements: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.print("Enter Elements in Array2 Elements: ");
		for(int i = 0;i<b.length;i++)
		{
			b[i] = s.nextInt();
		}
		
		boolean c = Arrays.equals(a, b);
		
		System.out.print("Both Arrays are equal: "+c);
		
	}

}
