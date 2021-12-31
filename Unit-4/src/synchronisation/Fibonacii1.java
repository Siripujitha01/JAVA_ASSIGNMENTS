package synchronisation;

public class Fibonacii1 extends Thread{
	Fibonacci ft;
    public Fibonacii1(Fibonacci f)
    {
    	ft=f;
    }
    public void run()
    {
    	ft.printfibonacii(10);
    }

}
