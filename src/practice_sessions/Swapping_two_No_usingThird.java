package practice_sessions;

import java.util.Scanner;

public class Swapping_two_No_usingThird {

	public static void main(String[] args) {
		
		int num1,num2,temp;   // num1 = 250, num2 = 300
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
	
		num1 = s.nextInt();  // 250
		num2 = s.nextInt();  //300
		
		temp = num1;  // temp = 250;
		num1 = num2;  // num1 = 300;
		num2 = temp;  // num2 = 250;
		
		System.out.println("After swapping: "+num1+" "+num2);
		
		

	}

}
