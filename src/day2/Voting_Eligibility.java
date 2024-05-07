package day2;

import java.util.Scanner;

public class Voting_Eligibility {

	public static void main(String[] args) {
		
		int age;
		System.out.print("Enter any age: ");
		Scanner obj = new Scanner(System.in);
		
		age = obj.nextInt();
		
		if(age>18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not Eligible for vote");
		}

	}

}
