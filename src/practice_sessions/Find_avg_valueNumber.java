package practice_sessions;

import java.util.Scanner;

public class Find_avg_valueNumber {

	public static void main(String[] args) {
		
		
		int m1,m2,m3,m4,m5;
		int sum = 0;
		double avg;
		
		System.out.print("Enter any marks: ");
		Scanner s = new Scanner(System.in);
		
		m1 = s.nextInt();
		m2 = s.nextInt();
		m3 = s.nextInt();
		m4 = s.nextInt();
		m5 = s.nextInt();
		
		sum = m1+m2+m3+m4+m5;
		
		avg = sum/5.0;
		
		System.out.print("Average of all Marks: "+avg);
	

	}

}
