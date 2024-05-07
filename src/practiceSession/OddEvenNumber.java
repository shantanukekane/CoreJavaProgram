package practiceSession;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
	
		
		int num;
		
		System.out.print("Enter any number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		if(num%2==0)
		{
			System.out.print("Even Number");
		}
		else
		{
			System.out.print("Odd Number");
		}
		
		
		
		
		

	}

}
