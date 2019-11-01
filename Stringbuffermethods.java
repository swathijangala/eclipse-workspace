package java_basics;

public class Stringbuffermethods {

	public static void main(String[] args) {
	String sb = "swathi";
    System.out.println(sb.charAt(5)); // sb.charAT(); METHOD
    
    StringBuffer sb1 = new StringBuffer("java");
    sb1.setCharAt(0, 's');
    System.out.println(sb1); // setCharAt(int index, char newchar);
    
    StringBuffer sb2 = new StringBuffer("hdjdv");
    sb2.append('d');   // append method
    System.out.println(sb2);
    
    StringBuffer sb3 = new StringBuffer("super");
    sb3.insert(2, "swa");
    System.out.println(sb3);  // sb.insert(int index,string s); //insert method
    
    StringBuffer sb4 = new StringBuffer("swathijangala");
    sb4.delete(2, 5);
    System.out.println(sb4);  //sb.delete(int begin, int end)  from begin index to end-1
     
    sb4.deleteCharAt(4);
    System.out.println(sb4);  // sb.deleteCharAt(); method
    
    sb4.reverse();
    System.out.println(sb4);  // sb.reverse();  method
    
    sb4.setLength(4);
    System.out.println(sb4); // SetLength(int length); method
    
    sb4.setLength(4);
    System.out.println(sb4);
    
    StringBuffer sb5 = new StringBuffer();
    System.out.println(sb5.capacity());
    sb5.ensureCapacity(1000);
    System.out.println(sb5.capacity()); // ensurecapacity(int capacity); method
    
    StringBuffer sb6 = new StringBuffer(1000);
    sb6.append("abc");
    System.out.println(sb6.capacity());
    sb6.trimToSize();
    System.out.println(sb6.capacity()); //trimTosize(); // remove unwanted
    
    // METHOD CHAINING//
    
    StringBuffer sb7 = new StringBuffer();
    sb7.append("SWATHI").append("JANGALA").reverse().insert(4,"desf").delete(3,7);
    System.out.println(sb7);
	}

}
