package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_copyofMethods {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		System.out.print("Enter data in arrays: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		int a2[] = Arrays.copyOf(a, 5);
		
		System.out.print("Arrays Elements are copied: ");
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a2[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
