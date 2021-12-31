import java.util.*;
class CheckingAnagram{
int i,k=0;
public void anagram(String n1,String n2){
if (n1.length()==n2.length()){
for (i=0;i<n1.length();i++){
for (int j=0;j<n1.length();j++){
if (n1.charAt(i)==n2.charAt(j)){
k=k+1;
}
}
}
if (k==n1.length())
System.out.println("GIVEN STRINGS ARE ANAGRAM");
else
System.out.println("GIVEN STRINGS ARE NOT ANAGRAM");
}
else {
System.out.println("GIVEN STRINGS ARE NOT ANAGRAM");
}
}
}
public class Anagram {
	public static void main(String[] args) {
		String n1,n2;
		Scanner sc=new Scanner(System.in);
		 System.out.print("ENTER FIRST STRING:");
		 n1=sc.next();
		 System.out.print("ENTER SECOND STRING:");
		 n2=sc.next();
		 CheckingAnagram c1=new CheckingAnagram();
		 c1.anagram(n1, n2);
	}

}
