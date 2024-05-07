package practice_sessions;

import java.util.Scanner;

public class SearchElementsArray {

	public static void main(String[] args) {
	
		int a[] = new int[5];
	    int n,count=0;
		System.out.print("Enter Elements in an Array: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.print("Search array Elements: ");

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
			System.out.print("item founds "+count+ " times");
		}
		else
		{
			System.out.print("item not found");
		}
	

	}

}

