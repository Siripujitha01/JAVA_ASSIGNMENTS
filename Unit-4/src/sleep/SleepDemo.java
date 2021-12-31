package sleep;

public class SleepDemo extends Thread{
	public void run()
	  {
		  for (int i=1;i<=10;i++)
		  {
			  System.out.print(i+"\t");
			  try
			  {
				  Thread.sleep(5000);
			  }
			  catch(InterruptedException ie)
			  {
				  System.out.println(ie.getMessage());
			  }
		  }
	  }
}

