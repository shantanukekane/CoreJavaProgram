package practice_sessions;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		int a[] = new int[5]; int n,count=0;
		
		System.out.print("Enter Elements ");
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
		
		System.out.print("\nsearch Element : ");
		n = s.nextInt(); 
		
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		
		if(count>0)
		{
			System.out.println("item found: "+count+" times");
		}
		else
		{
			System.out.println("item not found");

		}
		
		
		
		
		
		
		

	}

}
