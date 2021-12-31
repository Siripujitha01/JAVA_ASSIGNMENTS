import java.util.*;
import java.util.StringTokenizer;
class CaseChanging{
int i;
char t;
public void caseChanging(String s){
StringTokenizer st = new StringTokenizer(s, " ");
while(st.hasMoreTokens()) {
for (i=0;i<s.length();i++){
if (Character.isUpperCase(s.charAt(i))){
char c= Character.toLowerCase(s.charAt(i));
System.out.print(c);
}
else{
char c= Character.toUpperCase(s.charAt(i));
System.out.print(c);
}
}
break;
}
}
}
public class StringCase {
	public static void main(String[] args) {
		 String n="tHis Is a pRogRam";
		 CaseChanging c1=new CaseChanging();
		 c1.caseChanging(n);
	}

}
