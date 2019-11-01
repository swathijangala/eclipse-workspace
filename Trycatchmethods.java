package java_basics;

public class Trycatchmethods {

	public static void main(String[] args) {
		System.out.println("statement-1");
		System.out.println(10/0);
		System.out.println("ststement-3"); // without try-catch methods ; abnormal termination
	
	System.out.println("state-1");
	try {
		System.out.println("10/0");
	}
	catch(ArithmeticException e) 
	{
		System.out.println("10/2");
	}
	System.out.println("stat-3");// with try and catch methods : normal termination
	}
	
	

}

