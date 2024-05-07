package practice_sessions;

import java.util.Scanner;

public class Swapping_withoutThird_variable {

	public static void main(String[] args) {
	
		
		int n1,n2;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		n1 = s.nextInt(); // 20 
 		n2 = s.nextInt(); // 40
		
		n1 = n1 + n2; // n1 = 20 + 40 = 60;
		n2 = n1 - n2; // n2 = 60 - 40 = 20;
		n1 = n1 - n2; // n1 = 60 - 20 = 40;
		
		System.out.print("after swapping: "+n1+" "+n2);

		
		
		
		
		
		

	}

}
