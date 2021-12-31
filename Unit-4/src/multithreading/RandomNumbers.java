package multithreading;
import java.util.*;
public class RandomNumbers extends Thread{
	public synchronized void run()
    {
 	   System.out.println("\n RANDOM NUMBERS UPTO 50:");
 	  Random rn=new Random();
 	  int i=rn.nextInt(50);
 		   System.out.print(i+"\t");
}
}


