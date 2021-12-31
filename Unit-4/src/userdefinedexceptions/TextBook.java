package userdefinedexceptions;
import java.util.*;
public class TextBook {
	String  textbooktitle,textbookauthor;
	int noofpages,priceoftextbook;
	Scanner sc=new Scanner(System.in);
	public void  textBookDetails() throws NegativePagesException,NegativePriceException
	{
		System.out.println("ENTER TEXTBOOK NAME:");
		textbooktitle=sc.nextLine();
		System.out.println("ENTER AUTHOR NAME:");
		textbookauthor=sc.nextLine();
		System.out.println("ENTER NO.OF PAGES:");
		noofpages=sc.nextInt();
		System.out.println("ENTER PRICE OF BOOK:");
		priceoftextbook=sc.nextInt();
		if (priceoftextbook<0)
		{
			throw new NegativePriceException("INVALID PRICE");
		}
		else
			System.out.println();
		if (noofpages<0)
		{
			throw new NegativePagesException("INVALID NO.OF PAGES");
		}
		else
			System.out.println();

	}
	public void displayTextbookDetails()
	{
		System.out.println("TEXTBOOK NAME:"+textbooktitle);
		System.out.println("AUTHOR NAME:"+textbookauthor);
		System.out.println("NO.OF PAGES:"+noofpages);
		System.out.println("PRICE OF BOOK:"+priceoftextbook);

	}


}
