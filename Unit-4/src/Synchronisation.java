import synchronisation.*;
public class Synchronisation {
	public static void main(String args[])
	 {
		 Fibonacci ft=new  Fibonacci();
		 Fibonacii1 f1=new  Fibonacii1(ft);
		 Fibonacii2 f2=new  Fibonacii2(ft);
		 f1.start();
		 f2.start();
	 }

}
