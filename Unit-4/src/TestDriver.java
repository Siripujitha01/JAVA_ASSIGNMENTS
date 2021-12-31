import userdefinedexceptions.*;

public class TestDriver {
	public static void main(String args[])
	{
		TextBook tb=new TextBook();
		try
		{
			tb.textBookDetails();
			tb.displayTextbookDetails();
		}
		catch(NegativePriceException np)
		{
		        System.out.println(np);
		}
		catch (NegativePagesException ne)
		{
			System.out.println(ne);
		}
	}

}
