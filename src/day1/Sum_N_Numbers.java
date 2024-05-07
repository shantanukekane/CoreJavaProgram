package day1;

import java.util.Scanner;

public class Sum_N_Numbers {

	public static void main(String[] args) {
		
		int n,sum = 0;
		System.out.println("Enter No of Terms: ");
		Scanner r = new Scanner(System.in);
		
		n = r.nextInt();
		int i = 1;
		while(i<=n)  // n = 10;
		{
			sum = sum +i;    //sum = 0 + 1
			System.out.print(sum+" "); // 1 3 6 10
			i++;
		}
		
		
		
		

	}

}
