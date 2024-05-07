package practiceSession;

import java.util.Scanner;

public class Arrays7 {

	public static void main(String[] args) {
		
		
		int a[] = new int[5];
		
		System.out.print("Enter Elements in an Array: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		int min = a[0];
		
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		
		System.out.print(min);
		
		
		
		

	}

}
