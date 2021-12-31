package realJava.loops;

public class SumN {
    int n,sum=0;
    public SumN(int a)
    {
  	  n=a;
    }
    public int sumn()
    {
  	  for(int i=0;i<=n;i++)
  		  sum+=i;
  	  return sum;
    }

}
