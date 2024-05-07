package day2;

import java.util.Scanner;

public class Calculate_avg_marks {

	public static void main(String[] args) {
		
		
	// find the average of 5 marks
		
		int a,b,c,d,e;
		
		System.out.print("Enter Number of subjects marks: ");
		
		Scanner s = new Scanner(System.in);
		
		 a = s.nextInt();
		 b = s.nextInt();
		 c = s.nextInt();
		 d = s.nextInt();
         e = s.nextInt();
         
		 int sum = a+b+c+d+e;
		 
       System.out.println("Total sum of all subject: "+sum);
       
       double avg = sum/5.0;
       
       System.out.println("avg of all marks is: "+avg);      
       
       
       
       
       
       
       
       
       
       
       
       
       
		 
	   	 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
