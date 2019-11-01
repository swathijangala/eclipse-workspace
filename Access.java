package java_basics;

public class Access {

	public static void main(String[] args) {
		
			
			AccountDatahiding acc1 = new AccountDatahiding();
			System.out.println(acc1.Accno);
			System.out.println(acc1.Accname);
			System.out.println(acc1.bal);
			
			System.out.println("jshsgx");
			acc1.bal = 0;
			System.out.println(acc1.bal);

	}

}
