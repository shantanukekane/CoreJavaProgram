package day8;

public class ArraysBiggestNumber {

	public static void main(String[] args) {
		
		int a[] = {20,100,28,58,85};
		int max = a[0];
		
		
		for(int i = 1;i<a.length;i++) // 1 2 3 4 // 100 28 58 85
		{
			if(a[i]>max)   // 100>20  28>100 58>100 85>100
			{
				max = a[i]; // max = 100,
			}
		}
	
		System.out.print("Maximum Number is: "+max);
		
		
		
		
		

	}

}
