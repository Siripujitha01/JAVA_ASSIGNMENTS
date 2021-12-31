package synchronisation;

public class Fibonacci {
	 public synchronized void printfibonacii(int f)
     {
     	 int a1=0,a2=1,a3;
     	System.out.print("\n FIBONACII SERIES UPTO "+f+"  TERMS IS:"+a1+"\t"+a2+"\t");
     	while(f-2>0)
     	{
     	a3=a1+a2;
     	System.out.print(a3+"\t");
     	a1=a2;
     	a2=a3;
     	f--;
     	}
     }

}
