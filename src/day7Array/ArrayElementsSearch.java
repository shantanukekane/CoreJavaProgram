package day7Array;

public class ArrayElementsSearch {

	public static void main(String[] args) {
		
		int a[] = {20,30,10,30,50,40,60};
		int i,count=0;
		int num1 = 30;
		System.out.print("Array Elements are: ");
		
		for(i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]==num1)
			{
				count++;
			}
		}
	
		if(count>0)
		{
			System.out.print("\nitem found "+count+ "times");
		}
		else
		{
			System.out.print("item not found ");

		}
		

	}

}
