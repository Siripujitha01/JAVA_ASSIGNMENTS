package multithreading;

public class EvenNumbers extends Thread{
	public synchronized void run()
    {
 	   System.out.println("\n EVEN NUMBERS UPTO 50:");
 	   for(int i=0;i<=50;i+=2)
 		   System.out.print(i+"\t");
    }
}


