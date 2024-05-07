package day4;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		// swaping of two number using third variable
		
		int ram,syam,raju;
		
		System.out.println("Enter Two Number: ");
		Scanner s =new Scanner(System.in);
		
		ram = s.nextInt();  // 200
		syam = s.nextInt();  // 400
		
		System.out.println("Before Swaping: "+ram+" "+syam);
		
		raju = ram;  // raju = 200
		ram = syam; // ram = 400
		syam = raju; // syam=200
		
		System.out.println("After Swaping: "+ram+" "+syam);

		
		
		
		
		

	}

}
