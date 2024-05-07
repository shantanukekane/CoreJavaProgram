package day6;

public class Palindrome_Numbers {

	public static void main(String[] args) {
		//input 121 ---------> 121 in reverse direction 
		
		int num = 196,remainder,a=0;  // 
		int b = num; //   b is for comparing
		
		
		while(num>0)    // 196 > 0 , 19>0
		{
			remainder = num%10;  // 196 % 10 = 6,  19 % 10 = 9
			a = (a*10)+remainder;  // a = (0*10) + 6, 60 + 9 = 69
			num = num/10; //19 , 1 
		}
		
		if(b == a)
		{
			System.out.print("Number is Palindrome");
		}
		else
		{
			System.out.print("Number is not palindrome");
		}

		
		

	}

}
