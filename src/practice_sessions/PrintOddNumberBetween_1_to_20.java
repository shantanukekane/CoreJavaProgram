package practice_sessions;

import java.util.Scanner;

public class PrintOddNumberBetween_1_to_20 {

	public static void main(String[] args) {
		
		int n;
		System.out.print("Enter No in terms: ");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		for(int i = 1;i<=n;i+=2)
		{
		    System.out.print(i+" ");
		}
		
	
	}

}
