package day1;

import java.util.Scanner;

public class Ternary_operator {

	public static void main(String[] args) {
		
		int a,b,c,max;
		System.out.println("Enter any Number: ");
		
		Scanner obj = new Scanner(System.in);
		
		a = obj.nextInt();
		b = obj.nextInt();
		c = obj.nextInt();
		
		max =(a>b)?a:(b>c)?b:c;
		
		System.out.println("Find out the largest number of any Three Number: "+max);
		
		
		

	}

}
