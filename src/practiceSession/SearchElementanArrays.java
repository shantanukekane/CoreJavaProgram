package practiceSession;

import java.util.Scanner;

public class SearchElementanArrays {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		int num,count=0;
		System.out.print("Enter any Elements in an Array: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.print("Array Elements are: ");
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
        System.out.print("\nsearch Array Element is: ");
		
        num  = s.nextInt();
       
        
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				count++;
			}
		}
		
		if(count>0)
		{
			System.out.print("item founds: "+count+" times");
		}
		else
		{
			System.out.print("item not found");
		}
		
		
		
		
		
		
		
		

	}

}
