package practiceSession;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
	
		
		int a[] = new int[5];
		
		System.out.print("Enter Elements in an array: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			
			a[i] = s.nextInt();
			
		}
		
		System.out.print("Array Elements: ");
		for(int i = 0;i<a.length;i++)
		{
			
			System.out.print(a[i]+" ");
			
		}
		System.out.print("\nArray reverse Elements: ");
		
		for(int i=a.length-1;i>=0;i--) 
		{
			
			System.out.print(a[i]+" ");
			
		}
	

	}

}
