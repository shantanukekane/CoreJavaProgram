package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Array_sort_bymethod {

	public static void main(String[] args) {
		
		int a[] = new int[4];
		
		System.out.print("Enter Elements in the Arrays: ");
		Scanner obj = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = obj.nextInt();
		}
		
		Arrays.sort(a);
		
		for(int i = 0;i<a.length;i++)
		{
			
			System.out.print(a[i]+"  ");
			
		}
		

	}

}
