package practiceSession;

import java.util.Scanner;

public class InsertValueArray {

	public static void main(String[] args) {
		
		int size,loc;
		
		System.out.print("Enter the size of an array: ");
		Scanner  s = new Scanner(System.in);
		
		size = s.nextInt();  // 5
		
		int a[] = new int[size];  // 5
		System.out.print("Enter Elements in an Array: ");
		
		for(int i = 0;i<size;i++)
		{
			a[i] = s.nextInt();  // 10  20 40 50 80
		}                        // 0    1  2  3 4
		
		System.out.print("Enter your location: ");
		loc = s.nextInt();    // 2
		
		for(int i = loc;i<size-1;i++)   // i = 2 ; 2<5-1 = 2<4
		{
			a[i] = a[i+1];   //  a[2] = a[2+1] = 3
		}
		size--;
		
		for(int i = 0;i<size;i++)
		{
			System.out.print(a[i]+" ");;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
