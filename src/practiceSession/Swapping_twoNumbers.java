package practiceSession;

import java.util.Scanner;

public class Swapping_twoNumbers {

	public static void main(String[] args) {
		
		int num1,num2,temp ;
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextInt(); // 200
		num2 = s.nextInt(); // 400
	     
		
		temp = num1 ; // temp = 200
		num1 = num2; // num1 = 400
		num2 = temp; // num2 = 200
		
		System.out.println("After Swapping the Numbers:  "+num1+"  "+num2);
		
		
		

	}

}
