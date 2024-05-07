package practiceSession;

import java.util.Scanner;

public class InsertElements {

	public static void main(String[] args) {
		
		int size,loc,item;
		
		System.out.print("Enter any size: ");
		Scanner s = new Scanner(System.in);
		
		size = s.nextInt(); // 4
		
		int a[] = new int[size+1]; // 5
		
		System.out.print("Enter Elements in Array: ");
		
		for(int i = 0;i<size;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.print("Enter any Location: ");
		loc = s.nextInt(); // 2 
		
		System.out.print("Enter new items: ");
		item = s.nextInt(); // 100 
		
		for(int i=size;i>loc;i--)
		{
			a[i] = a[i-1]; // 
		}
		
		a[loc] = item;
		size++;
		
		for(int i = 0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
