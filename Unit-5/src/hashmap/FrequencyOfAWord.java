package hashmap;
import java.util.*;
public class FrequencyOfAWord {
	Map<String,Integer> count =new HashMap<String,Integer>();
    String s;
    Scanner sc=new Scanner(System.in);
    public void input()
    {
    	System.out.println("ENTER A PARAGRAPH:");
    	s=sc.nextLine();
    }
    public void counting()
    {
    	StringTokenizer st = new StringTokenizer(s, " ");
        while(st.hasMoreTokens()) {
     	   String s1= st.nextToken();
     	   if(count.containsKey(s1))
     	   {
     		   count.put(s1,count.get(s1)+1);
     	   }
     	   else 
     	   {
     		   count.put(s1,1);
     	   }
        }
    }
    public void display()
    {
    	System.out.println(count);
    }
}
