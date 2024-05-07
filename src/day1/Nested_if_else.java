package day1;

import java.util.Scanner;

public class Nested_if_else {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		System.out.println("Enter your Number: ");
		Scanner s = new Scanner(System.in);
		
	    num1 = s.nextInt();
	    num2 = s.nextInt();
	    num3 = s.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Maximum Number is: "+num1);
			}
			else
			{
				System.out.println("Maximum Number is: "+num3);
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("Maximum Number is: "+num2);
			}
			else
			{
				System.out.println("Maximum Number is: "+num3);
			}
		}
		

	}

}
