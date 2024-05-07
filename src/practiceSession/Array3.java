package practiceSession;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		// input a[] = 10 20 30 40 50 ========b[] == 10 20 30 40 50
		
		int a[] = new int[5];
		int b[] = new int[5];
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
			b[i] = a[i];
		}
		
		System.out.print("\nCopied array Elements: ");
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		
		}
	
		

	}

}
