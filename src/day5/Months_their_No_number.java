package day5;

import java.util.Scanner;

public class Months_their_No_number {

	public static void main(String[] args) {
		
		
		int months;
		
		System.out.print("Enter any Month Number: ");
		Scanner s = new Scanner(System.in);
		
		months = s.nextInt();
		
		switch(months)
		{
		
		   case 1:System.out.println("Jan = 31 days");break;
		   case 2:System.out.println("Feb = 28 days");break;
		   case 3:System.out.println("Mar = 31 days");break;
		   case 4:System.out.println("Apr = 30 days");break;
		   case 5:System.out.println("May = 31 days");break;
		   case 6:System.out.println("June = 30 days");break;
		   case 7:System.out.println("July = 31 days");break;
		   case 8:System.out.println("Aug = 31 days");break;
		   case 9:System.out.println("Sep = 30 days");break;
		   case 10:System.out.println("Oct = 31 days");break;
		   case 11:System.out.println("Nov = 30 days");break;
		   case 12:System.out.println("Dec = 31 days");break;
		   default:System.out.println("Invalid Month Number");
		
		}
		
	

	}

}
