package practice_sessions;

import java.util.Scanner;

public class FindGreatestThreeNumber {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		num3 = s.nextInt();
		
		int n = (num1>num2)?num1:((num2>num3?num2:num3));
	
		System.out.print("Greatest Number is: "+n);
	
		

	}

}
