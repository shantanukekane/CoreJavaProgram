package day6_copy;

public class Check_perfect_Number {

	public static void main(String[] args) {
	
		int num=8,sum = 0;
		
		for(int i = 1;i<num;i++)
		{
	        if(num%i==0)
	        {
	        	sum = sum + i;
	        }
		}
		
		if(num == sum)
		{
			System.out.print("perfect number");
		}
		else
		{
			System.out.print("non perfect number");
		}
		
		

	}

}
