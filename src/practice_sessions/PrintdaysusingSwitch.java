package practice_sessions;

import java.util.Scanner;

public class PrintdaysusingSwitch {

	public static void main(String[] args) {
		
		
		int ch;
		
		Scanner s = new Scanner(System.in);

		System.out.print("Enter your choice: ");
		ch = s.nextInt();
		
		switch(ch)
		{
		  
		case 1 : System.out.print("Monday");break;
		case 2 : System.out.print("Tuesday");break;
		case 3 : System.out.print("Wednesday");break;
		case 4 : System.out.print("Thirsday");break;
		case 5 : System.out.print("Friday");break;
		case 6 : System.out.print("Saturday");break;
		case 7 : System.out.print("Sunday");break;
		default: System.out.print("Invalid choice");
		
		
		}
		
		

	}

}
