package day8;

import java.util.Scanner;

public class ArraySortAscendingorder {

	public static void main(String[] args) {
		
	
		int a[] = new int[5],temp;
		
		System.out.print("Enter any Numbers: ");
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
				
				    temp = a[i]; // temp = a[0] = 
				    a[i] = a[j]; // a[0] = a[1] 
			        a[j] = temp;
			
				}
				
			}
		
		}
		

		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	
		

	}

}
