package day1;

import java.util.Scanner;

public class SumOddEven {

	public static void main(String[] args) {
		
		
		int num;
		int sum = 0;
		System.out.println("Enter the Number: ");
		Scanner obj = new Scanner(System.in);
		
		num = obj.nextInt();
		int i;
	
	if(num%2==0)   // Number is even or not
	{
		for(i = 0;i<=num;i+=2)  // if even then we add some numbers
		{
			sum = sum + i;
			//System.out.println("Addition of Even Numbers: "+sum);

		}
		System.out.print("Addition of Even Numbers: "+sum);
	}	
	else
	{
		for(i = 1;i<=num;i+=2)  // if number is 
		{
			sum = sum + i;
		}
		System.out.print("Addition of odd Numbers: "+sum);
		
	}
		
		
		
	}

}
