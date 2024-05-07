package practiceSession;

import java.util.Scanner;

public class Factor_Number {

	public static void main(String[] args) {
		
		//input 6 ===== 1 2 3 6
		int num;
		int fact;
		System.out.print("Enter any Number: ");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		for(int i = 1;i<=num;i++)  // 6 
		{
			
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
