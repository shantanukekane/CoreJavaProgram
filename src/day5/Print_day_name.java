package day5;

import java.util.Scanner;

public class Print_day_name {

	public static void main(String[] args) {
		
		int  weekdays;
		
		System.out.print("Enter any Number: ");		
		Scanner obj = new Scanner(System.in);
		
		weekdays = obj.nextInt();
		
		switch(weekdays)
		{
		   case 1:System.out.println("Monday");break;
		   case 2:System.out.println("Tuesday");break;
		   case 3:System.out.println("Wednesday");break;
		   case 4:System.out.println("thirday");break;
		   case 5:System.out.println("Friday");break;
		   case 6:System.out.println("Saturday");break;
		   case 7:System.out.println("sunday");break;
		   default:System.out.println("invalid input");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
