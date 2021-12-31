package realJava.loops;

public class FactN {
	int n,r=1;
    public FactN(int a)
    {
          n=a;
    }
    public int factn()
    {
 	   if (n==0)
 		   return 1;
 	   else{
 	   while(n!=0)
 	   {
 	  	 r*=n;
 	  	 --n;
 	   }
 	   return r;
 	   }
    }

}
