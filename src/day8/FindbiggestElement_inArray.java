package day8;

import java.util.Scanner;

public class FindbiggestElement_inArray {

	public static void main(String[] args) {
		
		// input -------20 50 60 100 80
		
		int a[] = new int[5];
		int max;
		
		System.out.print("Enter any Elements in Array: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++) //20 50 60 100 80
		{
			
			a[i] = s.nextInt();
			
		}
		
		max = a[0];
		
		for(int i = 1;i<a.length;i++) //1 2 3 4  // 50 60 100 80
		{
			if(a[i]>max)   // 50 > 20; 60>50, 100>60, 100>80
			{
				max = a[i];  // max = 50, max = 60,  max = 100
				
			}
		}
		
		System.out.print("Maximum Number is: "+max);
		
		
		
		
		
		
		
		
		
		
		

	}

}
