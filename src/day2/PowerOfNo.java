package day2;

import java.util.Scanner;

public class PowerOfNo {

	public static void main(String[] args) {
		
		 // input = 5**2 5**3 
		// power = 3;
		// number = 
		int power;
		int num;
		int result = 1;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		System.out.print("Enter any power: ");
		power = s.nextInt();
		
		for(int i = 1;i<=power;i++) // 
		{
			result = result * num;    
		}
		System.out.print(result);
		
		
		
		
		
		
		
		

	}

}
