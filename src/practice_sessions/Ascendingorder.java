package practice_sessions;

import java.util.Scanner;

public class Ascendingorder {

	public static void main(String[] args) {

		int a[] = new int[5];  // 10 20 30 40 50
		int temp,i,j;
		
		System.out.print("Enter Elements are Array: ");
		Scanner s = new Scanner(System.in);
		
		
		for(i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();   // 10 20 50 15 30
		}
		
		
		for(i = 0;i<a.length;i++)  // i=0 i=1 
		{
			for(j = i+1;j<a.length;j++)  // j=1 j=2 j=3
			{
				if(a[i]>a[j])  // 10>20 10>30 
				{
					
					temp = a[i]; // temp = 
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		
		for(i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
