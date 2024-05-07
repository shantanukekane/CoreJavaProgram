package day7Array;

import java.util.Scanner;

public class Search_ElementsinArray {

	public static void main(String[] args) {
		
		
		int a[] = new int[5],i,count=0;
        int n;
		
		System.out.print("Enter Elements in Array: ");
		Scanner s = new Scanner(System.in);
		
		for(i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.print("Array Elements: ");
		
		for(i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
		System.out.print("\nEnter search Elements :");
		n = s.nextInt();
		
		for(i = 0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		
		if(count>0)
		{
			System.out.print("item found "+count+" times");
		}
		else
		{
			System.out.print("item Not found");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
