package practiceSession;

import java.util.Scanner;

public class SumOfArrays {

	public static void main(String[] args) {
		
		
		int a[] = new int[5];
		int sum = 0;
		System.out.print("Enter any Elements: ");
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			
			a[i] = s.nextInt();
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			
			sum = sum + a[i];
		}
		System.out.print("Addition of an array is: "+sum);
		
		
		
		
		
		
		

	}

}
