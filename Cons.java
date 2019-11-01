package java_basics;

public class Cons {
	public Cons () {
	System.out.println("Defalut constr");//DEFAULT CONSTRUCTOR
	}
	
	public Cons (int ID,String name) {
	System.out.println("2-paramized constructor");// parameterized constructor
		System.out.println(ID);
		System.out.println(name);//
	}
	
	public static void main(String[] args) {
	new Cons();
	new Cons(101,"pranith");
	}

}
