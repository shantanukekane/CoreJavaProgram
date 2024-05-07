package practice_sessions;

import java.util.Scanner;

public class Calculators {

	public static void main(String[] args) {
		
		int n1,n2,ch;
		double cal;
		System.out.print("Enter any Number: ");		
		Scanner s = new Scanner(System.in);
		
		n1 = s.nextInt();
		n2 = s.nextInt();
		
		System.out.print("Enter your choice: ");
		ch = s.nextInt();
		
		switch(ch)
		{
		case 1: cal = n1 + n2;System.out.print("Addition of two Number: "+cal);break;
		case 2: cal = n1 * n2;System.out.print("Multiplication of two Number: "+cal);break;
		case 3: cal = n1 / n2;System.out.print("division of two Number: "+cal);break;
		case 4: cal = n1 - n2;System.out.print("subtraction of two Number: "+cal);break;
		case 5: cal = n1 % n2;System.out.print("remainder of two Number: "+cal);break;
        default: System.out.print("invalid choice: ");

		
		}
		
		
		
		
		
		

	}

}
