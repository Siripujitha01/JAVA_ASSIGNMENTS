package synchronisation;

public class Fibonacii2 extends Thread{
	Fibonacci ft;
    public Fibonacii2(Fibonacci f)
    {
    	ft=f;
    }
    public void run()
    {
    	ft.printfibonacii(15);
    }

}

