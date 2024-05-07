package practice_sessions;

import java.util.Scanner;

public class AvgArray {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		int sum=0;
		double avg;
		System.out.print("Enter Elements: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
			sum = a[i] + sum;
		}
		
		System.out.print("\naddition of Array: "+sum);
		
		avg = sum/a.length;
		System.out.print("\nAvg of an Array: "+avg);
		
		
		

	}

}
