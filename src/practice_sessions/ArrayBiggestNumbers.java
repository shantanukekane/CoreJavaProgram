package practice_sessions;

import java.util.Scanner;

public class ArrayBiggestNumbers {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		System.out.print("Enter any Elements: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
			
		}
		
		int max = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max) 
			{
				max = a[i];
			}
		}
		
		System.out.print(max);
		
		
		
		
		
		
		
		
		
		
		

	}

}
