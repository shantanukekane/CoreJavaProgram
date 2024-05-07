package practiceSession;

import java.util.Scanner;

public class InsertValueinArray {

	public static void main(String[] args) {
		
		int size,loc,item;
		
		System.out.print("Enter any size: ");
		Scanner s = new Scanner(System.in);
		
		size = s.nextInt();
		
		int a[] = new int[size+1];
		System.out.print("Enter Array Elements: ");
		for(int i = 0;i<size;i++)
		{
			a[i] = s.nextInt();
			
		}
		
		
		System.out.print("Enter Array location: ");
		loc = s.nextInt();
		
		System.out.print("Enter new items: ");
		item = s.nextInt();
		
		for(int i = size;i>loc;i--)
		{
			a[i] = a[i-1];
		}
		
		a[loc] = item;
		size++;
		
		for(int i = 0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
