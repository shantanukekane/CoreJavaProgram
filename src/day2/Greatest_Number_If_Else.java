package day2;

import java.util.Scanner;

public class Greatest_Number_If_Else {

	public static void main(String[] args) {
		
		
		int num1,num2,num3;
		
		System.out.println("Enter any Number: ");
		
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		num3 = s.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Greatest Number is: "+num1);			
				
			}
			else
			{
				System.out.println("Greates Number is: "+num3);
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("Greatest Number is: "+num2);
			}
			else
			{
				System.out.println("greatest Number is: "+num3);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
