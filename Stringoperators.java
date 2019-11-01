package java_basics;

public class Stringoperators {
       //Sting operators//
	public static void main(String[] args) {
		String s1 = new String ("swathi");
		String s2 = new String ("swathi");
        System.out.println(s1==s2);  
        System.out.println(s1.equals(s2));
        
        
        //stringBuffer operators//
        StringBuffer s3 = new StringBuffer ("swathi");
		StringBuffer s4 = new StringBuffer ("swathi");
        System.out.println(s3==s4);  
        System.out.println(s3.equals(s4));
	}

}
