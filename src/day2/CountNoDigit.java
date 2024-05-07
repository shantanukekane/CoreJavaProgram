package day2;

import java.util.Scanner;

public class CountNoDigit {

	public static void main(String[] args) {
		
		// input = 345678 ------->6
		
		int n;
		int cnt = 0;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		/*
		for(cnt=0;n>0;cnt++)
		{
			n = n/10;
		}
		System.out.println("Total Number of count: "+cnt);
		
		*/
		
		while(n>0)
		{
			n = n/10;
			cnt++;
			
		}
		System.out.print("Total Number of digits: "+cnt);
	
		

	}

}
