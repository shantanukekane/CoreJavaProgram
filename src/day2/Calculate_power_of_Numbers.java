package day2;

import java.util.Scanner;

public class Calculate_power_of_Numbers {

	public static void main(String[] args) {
		
		
		int num,power;
		int r = 1;
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		System.out.println("Enter any power: ");
		power = s.nextInt();
		
		for(int i = 1;i<=power;i++)
		{ 
			r = r*num;  // 5   25  125     if power = 3
		}
		System.out.print(r);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
