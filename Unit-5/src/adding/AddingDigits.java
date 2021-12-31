package adding;
import java.util.*;
public class AddingDigits {
	String a,b;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter a 20 Digit Number:");
		a=sc.next();
		System.out.println("Enter another 20 Digit Number:");
		b=sc.next();
	}
	ArrayList<Integer> al1=new ArrayList<Integer>();
	ArrayList<Integer> al2=new ArrayList<Integer>();
	ArrayList<Integer> sum=new ArrayList<Integer>();
   public void adding()
   {
	   for (int i=a.length()-1;i>=0;i--)
	   {
		   al1.add(Integer.parseInt(a.charAt(i)+""));
	   }
	   for (int i=b.length()-1;i>=0;i--)
	   {
		   al2.add(Integer.parseInt(b.charAt(i)+""));
	   }
	   for (int i=0;i<al1.size();i++)
	   {
		   int a1=(al1.get(i));
		   int a2=(al2.get(i));
		   int c=a1+a2;
		   if(c>9)
		   {
			   if(i==al1.size()-1)
			   {
				   sum.add(c);
			   }
			   else 
			   {
				   int s=c/10;
				   c=c%10;
				   int s1=al1.get(i+1);
				   s1+=s;
				   al1.set(i+1,s1);
				   sum.add(c);
			   }
		   }
		   else
		   {
			   sum.add(c);
		   }
	   }
	   for (int i=sum.size()-1;i>=0;i--)   
	   {
	   System.out.print(sum.get(i));
	   }
	   
   }
}
