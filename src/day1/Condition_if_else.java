package day1;

import java.util.Scanner;

public class Condition_if_else {

	public static void main(String[] args) {
		
		int pwd;
		
		System.out.println("Enter password: ");
		
		Scanner obj = new Scanner(System.in);
		
		pwd = obj.nextInt();
		
		if(pwd==5858)
		{
			System.out.println("My Name: Shantanu");
			System.out.println("My age: 30");
			System.out.println("My address:Plot No-13 Digambar Nagar Amrutdham");
			
		}
		else
		{
			System.out.println("Invalid password");
		}
		
		
		
		
		

	}

}
