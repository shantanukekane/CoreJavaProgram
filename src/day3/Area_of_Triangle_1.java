package day3;

import java.util.Scanner;

public class Area_of_Triangle_1 {

	public static void main(String[] args) {
		
		int a,b,c,sp;
		double area;
		
		System.out.print("Enter value of the side: ");
		Scanner s = new Scanner(System.in);
		
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		// find the semiphere
		
		sp = (a+b+c)/2;
		
		area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		
		System.out.println("Area of Triangle is: "+area);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
