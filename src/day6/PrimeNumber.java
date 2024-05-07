package day6;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//input ---------7 ------------prime number 1,7
		
		int n = 17,count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count ==2)
		{
			System.out.print("prime Number");
		}
		else
		{
			System.out.print("Not prime Number");
	
		}

	}

}
