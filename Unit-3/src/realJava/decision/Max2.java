package realJava.decision;

public class Max2 {
	int n1,n2;
    public Max2(int a1,int a2)
    {
    	n1=a1;
    	n2=a2;
    }
    public int max2()
    {
    	if (n1>n2)
    		return n1;
    	else
    		return n2;
    }

}
