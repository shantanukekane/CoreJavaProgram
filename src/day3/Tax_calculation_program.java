package day3;

import java.util.Scanner;

public class Tax_calculation_program {

	public static void main(String[] args) {
		
		
		int salary;
		double tax;
		
		System.out.println("Enter Your salary: ");
		
		Scanner s = new Scanner(System.in);
		
		
		salary = s.nextInt();
		
		if(salary<=50000)
		{
			System.out.println(salary+" No tax");
		}
		else if(salary>50000 && salary<=100000)
		{
		     tax =salary*0.10;
			System.out.println(salary+" "+tax);

		}
		else
		{
		    tax = salary*0.20;
			System.out.println(salary+" "+tax);

		}
		
		
	}

}
