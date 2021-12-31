package TreeSet;
import java.util.*;
public class Strings {
           String s;
           Scanner sc=new Scanner(System.in);
           public void input()
           {
        	   System.out.println("ENTER COMMA SEPARETED STRINGS:");
        	   s=sc.nextLine();
           }
           public void sorting(){
           TreeSet<String> ts = new TreeSet<String>(); 
           StringTokenizer st = new StringTokenizer(s, ",");
           while(st.hasMoreTokens()) {
        	   String key = st.nextToken();
        	   ts.add(key);
           }
           System.out.println(ts);
           }
}
