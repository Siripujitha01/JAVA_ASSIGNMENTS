package multithreading;

public class OddNumbers extends Thread{
	public synchronized void  run()
    {
 	   System.out.println("\n ODD NUMBERS UPTO 50:");
 	   for(int i=1;i<=50;i+=2)
 		   System.out.print(i+"\t");
    }

}

