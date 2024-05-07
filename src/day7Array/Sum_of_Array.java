package day7Array;

import java.util.Scanner;

public class Sum_of_Array {

	public static void main(String[] args) {
		
		int num[] = new int[4];
		int sum = 0;
		
		System.out.print("Enter Elements in array:");
		Scanner obj = new Scanner(System.in);
		
		for(int i = 0;i<num.length;i++)
		{
			num[i] = obj.nextInt();
		}
		
		for(int i = 0;i<num.length;i++)
		{
	        System.out.print(num[i]+" ");
	        sum = sum + num[i];
		}
		
		System.out.print("\nAddition of Array: "+sum);
		
		
		
		
		

	}

}
