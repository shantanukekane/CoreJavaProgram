package practice_sessions;

import java.util.Scanner;

public class Tax_salary {

	public static void main(String[] args) {
		
		int salary;
		double tax;
		
		System.out.print("Enter your salary: ");
		Scanner s = new Scanner(System.in);
		
		salary = s.nextInt();
		
		if(salary<=50000)
		{
		
			System.out.print(salary+" No tax");
		}
		else if(salary>=50000 && salary<=100000)
		{
			tax = salary*0.20;
			System.out.print(salary+" tax is:"+tax);
		}
		else
		{
			tax = salary*0.30;
			System.out.print(salary+" tax is:"+tax);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
