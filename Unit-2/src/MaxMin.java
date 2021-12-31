import java.util.*;
import java.util.StringTokenizer;
class StringToken{
String s;
int n,i=0,j,max,min;
int arr[];
Scanner sc=new Scanner(System.in);
public void maxMin(){
arr=new int[100];
System.out.println("ENTER A COMMA SEPARATED LIST OF NUMBERS:");
s=sc.next();
StringTokenizer st = new StringTokenizer(s, ",");
while(st.hasMoreTokens()) {
String val = st.nextToken();
n=Integer.valueOf(val);
arr[i]=n;
i++;
}
max=arr[0];
min=arr[0];
for (j=0;j<i;j++){
if(max<arr[j]){
max=arr[j];
}
if (min>arr[j]){
min=arr[j];
}
}
System.out.println("MAXIMUN AND MINIMUM NUMBERS ARE:"+max+" , "+min);
}
}

public class MaxMin {
	public static void main(String[] args) {
		StringToken s1=new StringToken();
		s1.maxMin();
	}

}
