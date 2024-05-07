package practice_sessions;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		
		int a[] = new int[5]; // e.g 20 100 50 25 45
		int max = a[0];
		
		System.out.print("Enter Elements in an Array: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 1;i<a.length;i++)
		{
			a[i] = s.nextInt(); 
		}
		
		for(int i = 1;i<a.length;i++) // 1 2 3 4    // e.g  100 50 25 45
		{
			if(a[i]>max)   // 100>20  50>100  25>100 45>100
			{
			   max = a[i];	 //max = 100
			}
		}
		
		System.out.print("Maximum Number: "+max);
		
		
		

	}

}
