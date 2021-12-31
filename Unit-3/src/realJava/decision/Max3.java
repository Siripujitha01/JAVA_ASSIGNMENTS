package realJava.decision;

public class Max3 {
	int n1,n2,n3;
    public Max3(int a1,int a2,int a3)
    {
    	n1=a1;
    	n2=a2;
    	n3=a3;
    }
    public int max3()
    {
    	if (n1>n2)
    	{
    	if  (n1>n3)
    		return n1;
    	else
    		return n3;
    	}
    	else
    	{
    		if (n2>n3)
    			return n2;
    		else 
    			return n3;
    	}
    }

}
