package practiceSession;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		int max = a[0];
	    System.out.print("Enter Elements in an Array: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
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
		
		System.out.print("Maximum Number of an Array Element: "+max);
		
		
		

	}

}
