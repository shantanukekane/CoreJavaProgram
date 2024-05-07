package day8;

import java.util.Scanner;

public class ArraySortByAscendingOrder {

	public static void main(String[] args) {
		
		// input = 20,10,12,50,60
		
		int a[] = new int[5];
		int temp;
		
		System.out.print("Enter Elements in an Array: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i]; // temp = e.g 20
					a[i] = a[j]; // a[0] = e.g 10
					a[j] = temp; // a[1] = e.g 20
					
				}
			}
		}
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
