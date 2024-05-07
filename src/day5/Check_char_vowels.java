package day5;

import java.util.Scanner;

public class Check_char_vowels {

	public static void main(String[] args) {
		
	  // vowels = a,e,i,o,u	
		
	  char ch;
	  
	  System.out.println("Enter any char value: ");
	  Scanner s = new Scanner(System.in);
	  
	  ch = s.next().charAt(0);
	  
	  if(ch =='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	  {
		  System.out.println("Vowel is : "+ch);
	  }
	  else
	  {
		  System.out.println("consonant is: "+ch);
	  }
	  
	  
	  
	  
	  
	  
	  
	  
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
