package exceptions;
import java.util.*;

public class MultipleExceptionHandling {
	int a;
	String b;
	int c[]=new int[4];
	public void exceptionsHandling()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A VALUE:");
		a=sc.nextInt();
		System.out.println("ENTER ANOTHER VALUE:");
		b=sc.next();
		try
		{
			c[5]=a+Integer.parseInt(b);
			c[3]=a/Integer.parseInt(b);
			System.out.println("ADDITION OF TWO NUMBERS:"+c[5]);
			System.out.println("DIVISION OF TWO NUMBERS:"+c[3]);
		}
		catch(ArithmeticException ae) {
		       System.out.println("ZERO DIVISION ERROR");}
		catch(NumberFormatException ne)
		{
			System.out.println(ne.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ie)
		{
			System.out.println(ie.getMessage());
		}
		finally
		{
			System.out.println("EXCEPTIONS ARE HANDLED");
		}
	}


}
