package java_basics;
import java.io.*;
public class Defaultexception {

	public static void main(String[] args) {
		doStuff();
		System.out.println(10/0);
	}
	private static void doStuff() {
		
		doMoreStuff(); 
		System.out.println("HI");
	}
	private static void doMoreStuff() {
		System.out.println("SWATHIJANGALA");
		
		Defaultexception pw = new Defaultexception();
		pw.println("hello");
		
		
	
	}
	private void println(String string) {
		// TODO Auto-generated method stub
		
	}
	
	}
	
			
		
		
	


