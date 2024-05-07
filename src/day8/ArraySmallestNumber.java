package day8;

import java.util.Scanner;

public class ArraySmallestNumber {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		int min;
		System.out.print("Enter data into Arrays: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		min = a[0];
		
		for(int i = 1;i<a.length;i++) 
		{
			if(a[i]<min)    
			{
				min = a[i];
			}
		}
		
		System.out.print("Smallest Number is: "+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
