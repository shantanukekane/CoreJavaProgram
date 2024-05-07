package practice_sessions;

import java.util.Scanner;

public class SearchArrayElements {

	public static void main(String[] args) {
		
		
		int a[] = new int[5];
		int num,count= 0;
		
		System.out.print("Enter Elements in Array: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		for(int i = 0;i<a.length;i++)
		{
		   System.out.print(a[i]+" ");
		}
		
		System.out.print("\nSearch Element:");
		num = s.nextInt();
		
		
		for(int i = 0;i<a.length;i++)
		{
		   if(a[i]==num)
		   {
			   count++;
		   }
		}
		
		if(count>0)
		{
			System.out.print("item found: "+count+" times");
		}
		else
		{
			System.out.print("item not  found");
		}
		
		
		
		
		
		
		

	}

}
