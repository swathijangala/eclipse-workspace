package java_basics;

public class Stringmethods {

	public static void main(String[] args) {
		String s = "swathi";
		System.out.println(s.charAt(3));
        System.out.println(s.charAt(1));  // charAT(); METHOD
        
        
    	String s1 = "SRIRAM";
        s1 = s1.concat("krishna");
        System.out.println(s1);   // S.CONCAT METHOD
        
        String s2 = "JAVA";
        System.out.println(s2.equals("java"));   // boolean equals method
        System.out.println(s2.equalsIgnoreCase("java")); // equalsIgnorecase method
        
        String s3 = "";
        System.out.println(s3.isEmpty());   // .isEmpty() method
        
        String s4 = "java";
        System.out.println(s4.length()); // length()method
        
        String s5 = "java";
        System.out.println(s5.replace('j','a')); // replace(char old,char new)method
        
        String s6 = "swathi jangala";
        System.out.println(s6.substring(2)); // substring()method
        System.out.println(s6.substring(1, 8)); // substring(int begin, int end); begin, end-1
        
        String s7 = "swathi jangala";
        System.out.println(s7.indexOf('t')); // indexOf('char')method
        System.out.println(s7.indexOf('a'));  // 1st place valuable only displays if it is no of times there
        // if char is not available output is= -1
        
       System.out.println(s7.lastIndexOf('a'));  // lastIndexof('char') METHOD
        System.out.println(s7.length());
        System.out.println(s7.trim().length()); // trim().length method remove the spaces btwn first and last of the string.
        
	}
	

}
