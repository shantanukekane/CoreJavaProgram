package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_equalsMethod {

	public static void main(String[] args) {
		
		int a[] = new int [6];
		int a2[] = new int [6];
		System.out.print("Enter Elements in any Arrays: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.print("Enter Elements in any Arrays2: ");

		for(int i = 0;i<a2.length;i++)
		{
			a2[i] = s.nextInt();
		}
		
		boolean c = Arrays.equals(a, a2);
		
		System.out.print("Arrays are equals : "+c);
		

	}

}
