package multithreading;

public class NaturalNumbers extends Thread{
    public synchronized  void run()
    {
 	   System.out.println("NATURAL NUMBERS UPTO 50:");
 	   for(int i=0;i<=50;i++)
 		   System.out.print(i+"\t");
    }

}


