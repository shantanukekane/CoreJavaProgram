package day1;

public class Nested_if_else_4 {

	public static void main(String[] args) {
	
		int a = 100,b = 350,c = 250;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Maximum Number: "+a);
			}
			else
			{
				System.out.println("Maximum Number: "+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("Maximum Number: "+b);
			}
			else
			{
				System.out.println("Maximum Number: "+c);
			}
		}
		

	}

}
