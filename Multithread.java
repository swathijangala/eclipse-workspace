package java_basics;

public class Multithread extends Thread {
	public void run () {
		for (int i=0;i<=10;i++) {
			System.out.println("child thread");
		}
	}
}
class Threaddemo {
	public static void main(String[] args) {
		Multithread t = new Multithread();
		t.start();
		for (int i=0;i<=10;i++) {
			System.out.println("MAIN thread");
	}
	}
}
