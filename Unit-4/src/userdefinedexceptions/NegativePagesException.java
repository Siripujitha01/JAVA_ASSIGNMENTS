package userdefinedexceptions;

public class NegativePagesException extends Exception{
	 public NegativePagesException(String msg)
	 {
		 super(msg);
	 }
	 public String toString()
	 {
		 String s="PLEASE ENTER A VALID NO.OF PAGES";
		 return s;
	 }
	}
