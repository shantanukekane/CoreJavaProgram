package practice_sessions;

import java.util.Scanner;

public class Multiplication_table_ {

	public static void main(String[] args) {
		
		
		int num;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		for(int i = 1;i<=10;i++)
		{
			System.out.println(num+"x"+i+"="+num*i);
		}
		
		
		
		
		
		
		
		
		

	}

}
