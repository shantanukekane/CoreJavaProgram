package practice_sessions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayusingSort {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		
		System.out.print("Enter Elements in Arrays: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		Arrays.sort(a);  // Ascending order
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
