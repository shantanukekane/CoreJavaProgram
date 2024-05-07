package day8;

public class ArraySmallestElements {

	public static void main(String[] args) {

		
		int a[] = {20,10,500,150,30,4};
		
		int min = a[0];
		
		
		for(int i = 1;i<a.length;i++) // 1 2 3 4 5 // 10 500 150 30 4
		{
			if(a[i]<min)  //  500<10 150<10 30<10 4<10
			{
				min = a[i]; // min = 10 , min = 4;
			}
		}
		
		System.out.print("Smallest Number is: "+min);
		
		
		
		
		

	}

}
