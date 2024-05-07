package practiceSession;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		int ch;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter any choice: ");
		ch = s.nextInt();
		
		switch(ch)
		{
		case 1:System.out.print("Monday");break;
		case 2:System.out.print("Tuesday");break;
		case 3:System.out.print("Wednesday");break;
		case 4:System.out.print("Thusday");break;
		case 5:System.out.print("Friday");break;
		case 6:System.out.print("Saturday");break;
		case 7:System.out.print("sunday");break;
		default:System.out.print("Invalid choice");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
