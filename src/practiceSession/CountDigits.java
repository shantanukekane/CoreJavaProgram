package practiceSession;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
		
		int num,count = 0;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		while(num>0)   // 32456>0   3245>0 
		{
			num = num/10;   // 32456/10 = 3245 
		    count++;
		} 
		System.out.print(count);
		
		
		

	}

}
