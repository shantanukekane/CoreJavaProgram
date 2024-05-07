package practiceSession;

import java.util.Scanner;

public class DeleteArrayValue {

	public static void main(String[] args) {
		
		int size,loc;
		
		System.out.print("Enter size of an Array: ");
		Scanner s = new Scanner(System.in);
		
		size = s.nextInt();
		
		int a[] = new int[5];
		
		System.out.print("Enter Elements in an Array: ");
		for(int i = 0;i<size;i++)
		{
			
			a[i] = s.nextInt();
			
		}
		
		System.out.print("Enter loc of an Array: ");
		
		loc = s.nextInt();
		
		for(int i = loc;i<size-1;i++)
		{
			a[i] = a[i+1];
		}
		size--;
		
		for(int i = 0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	
		
		
		

	}

}
