package practice_sessions;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
	
		
		// input 7 ---------- 1 7
		
		int n,fact=0;
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		for(int i = 1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
	
		

	}

}
