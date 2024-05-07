package practice_sessions;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		// input --- 5 == 5*1 
		int num;
		
		System.out.print("Enter any Number: ");
		Scanner s =new Scanner(System.in);
		
		num = s.nextInt();
		
		for(int i = 1;i<=10;i++)
		{
			//num = num*i;
			System.out.println(num+"x"+i+"="+num*i);
		}



		
		
		
		
		
		
		
		

	}

}
