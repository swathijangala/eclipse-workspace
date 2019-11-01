package java_basics;

public class Methodoverloading {
        public void m1() {
        	System.out.println("m1");
        }
        public void m2(int id) {
        	System.out.println("m2");
        }
        public void m3(int id, String name) {
        	System.out.println("m3");
        }

	public static void main(String[] args) {
		Methodoverloading l1 = new Methodoverloading();
		l1.m1();
		l1.m2(101);
		l1.m3(101, "swathi");

	}

}
