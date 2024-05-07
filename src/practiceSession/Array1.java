package practiceSession;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		System.out.print("Enter Elements in an Array: ");
		Scanner name = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			
			a[i] = name.nextInt();
			
		}
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
		
		
		
		

	}

}
