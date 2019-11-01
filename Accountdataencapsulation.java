package java_basics;
import java.io.Serializable;   //    rule for java.io.serializable to become java bean.
public class Accountdataencapsulation {
		private long AcNo;
		private String Accname;
		private float bal;  // data hiding used
       
		public void setAcNo(long  AcNO) {
			this.AcNo = AcNO;	
		}
		public void setAccname(String Accname) {
			this.Accname = Accname;	
	    }
		public void setbal(float bal) {
			this.bal = bal;	   // setter methods(syntax): public void setName(String newName) {
		    			                                       //   this.name = newName;}
		
	    }
		public float getBal() {
			return bal;
		}
		public void setBal(float bal) {
			this.bal = bal;
		}
		public long getAcNo() {
			return AcNo;
		}
		public String getAccname() {
			return Accname;
		}
		public float getbal() {
			return bal;
		}               // getter methods(syntax): public getName(){
		                //                             return Name;}
		
		}
