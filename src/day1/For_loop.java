package day1;

import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the Number: ");
		
		Scanner s = new Scanner(System.in);   // for input class 
		
		int a;
		
		a = s.nextInt();
		
		for(int i = 1;i<=10;i++)
		{
			System.out.println(a+"x"+i+":"+a*i);
		}
		

	}

}
