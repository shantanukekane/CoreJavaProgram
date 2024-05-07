package day1;

public class Second {

	
	int a = 20; // instance variable
	static double b = 20.4;    // static variable
	
	public static void main(String[] args) {
		boolean c = true;     // local variable 
		
		
		// for printing the instance variable 
		// we have to create a  class object for that variable
		Second s = new Second();
		System.out.println("The output of the instance variable is: "+s.a);
		
		// for static variable we Don't need to create object
		//we can directly get the output 
		System.out.println("The output of the static variable is: "+b);
		System.out.println(c);

		
		
		

	}

}
