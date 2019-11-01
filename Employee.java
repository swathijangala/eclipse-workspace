package java_basics;

public class Employee {
    int eID;
    String name;
    float salary;
    public Employee()    {                   
    // initializes instance var's with default values
    }
    public Employee(int eID, String name,float salary) {
    	//initializes instance var's with user values   (where this.keyword is used for the representing the instance variables)
    	
    	this.eID = eID;
    	this.name= name;
    	this.salary = salary;
    }
  
	public static void main(String[] args) {
	Employee eM1 = new Employee();
	System.out.println(eM1.eID);//0
	System.out.println(eM1.name);//null
	System.out.println(eM1.salary);//0.0
	
	    eM1.eID = 1001;
	    eM1.name = "swathi";
	    eM1.salary  = 3000.00f;
	    
	    System.out.println("ID:"+eM1.eID);
		System.out.println("name:"+eM1.name);
		System.out.println("salary:"+eM1.salary);
	
		
		Employee eM2 = new Employee();
		
		eM2.eID = 1002;
	    eM2.name = "NIKHIL";
	    eM2.salary  = 5000.00f;
	    
	    System.out.println(eM2.eID);
		System.out.println(eM2.name);
		System.out.println(eM2.salary);

	
		 Employee eM3;
		 eM3=eM1;
		 System.out.println("ID:"+eM3.eID);
			System.out.println("name:"+eM3.name);
			System.out.println("salary:"+eM3.salary);
			
	}
	
	

}
