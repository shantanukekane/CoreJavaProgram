package day8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethods_sort_copy_Equals {

	public static void main(String[] args) {
	
		int a[] = new int[5];
		
		System.out.print("Enter Elements in array_1: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
	   	Arrays.sort(a);
		
	   	for(int i = 0;i<a.length;i++)
	   	{
	   		System.out.print(a[i]+" ");
	   	}
	   	
		
	   	
		
		
		
		

	}

}
