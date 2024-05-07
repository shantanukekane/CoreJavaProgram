package practice_sessions;

import java.util.Scanner;

public class ArraysmallestNumber {

	public static void main(String[] args) {
		
		int a[] = new int[6];
		
		System.out.print("Enter Elements in an Array: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		int min = a[0];
		for(int i = 1;i<a.length;i++)
		{
			
			if(a[i]<min)
			{
				min = a[i];
			}
			
		}
		
		System.out.print(min);
		
		
		
		
		
		
		

	}

}
