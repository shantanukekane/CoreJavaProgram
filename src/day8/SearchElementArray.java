package day8;

import java.util.Scanner;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchElementArray {

	public static void main(String[] args) {
		
		int a[] = new int[5],count = 0;
		int num;
		System.out.println("Enter Elements are in Array: ");
		Scanner s =new Scanner(System.in);
		
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("\nArray Elements: ");
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.print("\nEnter search Element: ");
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
			System.out.print("item not found");
		}

	}

}
