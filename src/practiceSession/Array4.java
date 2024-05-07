package practiceSession;


import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
	
		int a[] = new int[5];
		int temp;
		System.out.print("Enter Elements in an Array: ");
		Scanner s = new Scanner(System.in);
		
		
		for(int i =0;i<a.length;i++)  // 10 20 30 40 50
		{
			a[i] = s.nextInt();
		}
		
		for(int i = 0;i<a.length;i++)  // a[0] = 10 
		{
			
			for(int j = i+1;j<a.length;j++)  //a[1] = 20  a[2] = 30 a[3] = 40 a[4] = 50
			{
				if(a[i]>a[j])  // 10>20
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
			
		}
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
