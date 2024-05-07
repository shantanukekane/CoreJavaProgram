package day7Array;

public class Search_Elementin_Array {

	public static void main(String[] args) {
		
		
		int a[] = {10,20,20,30,50,40,50};
		int count=0,i;
		int n = 50;
		
		System.out.print("Array Elements are: ");
		for(i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");  // 10 20 20 30 50 40 50
		}
		
		for(i = 0;i<a.length;i++)
		{
			if(a[i]==n)   // a[4] = 50 , a[6] = 50
			{
				count++; // 1 // 2
			}
		}
		
		if(count>0)
		{
			System.out.print("\nitem found: "+count+" times");
		}
		else
		{
			System.out.print("item not found");

		}
		

	}

}
