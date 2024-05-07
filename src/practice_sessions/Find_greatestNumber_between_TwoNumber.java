package practice_sessions;

import java.util.Scanner;

public class Find_greatestNumber_between_TwoNumber {

	public static void main(String[] args) {
		
		int num1,num2;
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		
	    int	greatestNumber = (num1>num2)?num1:num2;
		System.out.print(greatestNumber);
		
		
	}

}
