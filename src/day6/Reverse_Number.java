package day6;

public class Reverse_Number {

	public static void main(String[] args) {
		
		int num = 32354;
		int r;
		
		while(num>0) // num = 32354
		{
			r = num%10;
			System.out.print(r);
			num = num/10;
		}
		
		
	}

}
