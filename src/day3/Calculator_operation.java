package day3;

import java.util.Scanner;

public class Calculator_operation {

	public static void main(String[] args) {
		
		
		int n1,n2,ch,cal;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		n1 = s.nextInt();
		n2 = s.nextInt();
		
		System.out.println("Select operation:  ");
		
		ch = s.nextInt();		
		
		if(ch==1)
		{
            cal = n1 + n2;
            System.out.println("Addition of two Number: "+cal);
            
		}
		else if(ch==2)
		{
			cal = n1 - n2;
			System.out.println("Subtraction of two Number: "+cal);
		}
		else if(ch==3)
		{
			cal = n1*n2;
			System.out.println("Multiplication of two Number: "+cal);

		}
		else if(ch==4)
		{
			cal = n1/n2;
			System.out.println("Division of two Number: "+cal);

		}
		else
		{
			cal = n1%n2;
			System.out.println("Remainder of two Number: "+cal);
		}
		

	}

}
