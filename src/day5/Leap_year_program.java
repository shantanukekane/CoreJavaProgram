package day5;

import java.util.Scanner;

public class Leap_year_program {

	public static void main(String[] args) {
		
	 int year;
	 
	 System.out.print("Enter any Year: ");
	 Scanner s = new Scanner(System.in);
		
	 year = s.nextInt();	
	
	 if(year%100==0 && year%100 ==0 || year%100!=0 && year%4==0)
	 {
		 System.out.print("its a leap year");
	 }
	 else 
	 {
		 System.out.print("its not a leap year");

	 }
		
		
		

	}

}
