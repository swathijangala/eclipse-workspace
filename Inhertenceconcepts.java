package java_basics;

class A{
	public void m1() {
		System.out.println("SWATHI JANGALA");
	}

}
	class B extends A{
		public void m2() {
		System.out.println("NIKHIL REDDY");
	}
	}
	public class Inhertenceconcepts {
	public void main(String[] args) {
		A A1 = new A();
		A1.m1();  // VALID
		//A1.m2(); // INVALID
		B B1 = new B();
		B1.m1();
		B1.m2();
		
		//up casting //
		A A2 = new B();
		A2.m1(); // VALID
		//A2.m2();  // INVALID
		
		//DOWN CASTING//
		//B B2 = new A();  // INVALID   CASE-1
		B B3 = (B)A2;  // VALID
		B3.m1();//valid
		B3.m2();//valid    case-2
		A A3 = new A();
		A3.m1();
		A3.m2();
	}
	}

	


