package userdefinedexceptions;

public class NegativePriceException extends Exception {
	public NegativePriceException(String msg)
	 {
		 super(msg);
	 }
	 public String toString()
	 {
		 String s="PLEASE ENTER A VALID PRICE";
		 return s;
	 }
}
