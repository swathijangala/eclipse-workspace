package java_basics;

public class Controlflow {

	public static void main(String[] args) {
		boolean hunger = true;
		if(hunger) {
			System.out.println("i am so hungry");
			}
		else {
			System.out.println("i am not starving");
		}
		
		int hungerRating = 6;
		if(!(hungerRating != 5)) {
			System.out.println("i am ok");
		}
			else {
				System.out.println("i am not ok");
			}
			
		int month = 3;
		String monthString;
		
		switch (month){
			case 1: monthString = "january";
		     break;
			case 2: monthString = "feb";
			break;
			case 3: monthString = "march";
			break;
			default : monthString = "none of the above";
			break;
		}

		System.out.println("monthString");
		
		
		}
	
		
	}
