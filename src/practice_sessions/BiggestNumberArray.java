package practice_sessions;

import java.util.Scanner;

public class BiggestNumberArray {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		int max = a[0];
		System.out.print("Enter Elements in an Arrays: ");
		Scanner s = new Scanner(System.in);
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		for(int i = 0;i<a.length;i++)
		{
				if(a[i]>max)
				{
					max = a[i];
				}				
		}

		System.out.print("Biggest Number is: "+max);
		
		
		
		
		
		
		
		
		

	}

}
