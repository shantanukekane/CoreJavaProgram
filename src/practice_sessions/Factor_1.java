package practice_sessions;

import java.util.Scanner;

public class Factor_1 {

	public static void main(String[] args) {
		
		// input ====  20 ====== 1 2 4 5 10 20
		
		int n;
		
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		for(int i = 1;i<=n;i++)
		{
			
			if(n%i==0) // 20%1 20%2 20%4 20%5 ----like that
			{
				System.out.print(i+" ");
			}
			
		}
		
		
		
		
		

	}

}
