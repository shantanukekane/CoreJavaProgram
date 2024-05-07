package day2;

import java.util.Scanner;

public class Greatest_Number {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		System.out.println("Enter any Number: ");
		
		Scanner s = new Scanner(System.in);
		
	    num1 = s.nextInt();
	    num2 = s.nextInt();
	    num3 = s.nextInt();
		
		int a = (num1 > num2)?num1: ((num2 > num3)?num2:num3);

		System.out.println("Find the greatest Number: "+a);
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
