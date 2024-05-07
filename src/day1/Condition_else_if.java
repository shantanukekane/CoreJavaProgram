package day1;

import java.util.Scanner;

public class Condition_else_if {

	public static void main(String[] args) {
		
		int marks;
		System.out.println("Enter your marks: ");
		
		Scanner s = new Scanner(System.in);
		
		marks = s.nextInt();
		
		if(marks >= 75)
		{
			System.out.println("Grade A+ ====> Distinction");
		}
		else if(marks >= 60 && marks < 75)
		{
			System.out.println("Grade A ====> first class");
		}
		else if(marks >= 50 && marks < 60)
		{
			System.out.println("Grade B+ ====> higher second class");
		}
		else if(marks >= 40 && marks < 50)
		{
			System.out.println("Grade B =====> second class");
		}
		else
		{
			System.out.println("Grade c ====> failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
