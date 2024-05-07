package day3;

import java.util.Scanner;

public class Calculator_operator {

	public static void main(String[] args) {
		
		
		int n1,n2,ch;
		int cal;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		n1 = s.nextInt();
		n2 = s.nextInt();
		
		System.out.print("Enter any choices: ");
		ch = s.nextInt();
		
		switch(ch)
		{
		case 1: cal = n1 + n2;System.out.print("Addition : "+cal);break;
		case 2: cal = n1 - n2;System.out.print("Substraction: "+cal);break;
		case 3: cal = n1 * n2;System.out.print("Multiplication :"+cal);break;
		case 4: cal = n1 / n2;System.out.print("Division : "+cal);break;
		case 6: cal = n1 % n2;System.out.print("Remainder: "+cal);break;
		default: System.out.print("Invalid choice ");
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
