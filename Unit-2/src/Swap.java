class OverloadingSwap{
public void swap(int n1,int n2){
int n;
n=n1;
n1=n2;
n2=n;
System.out.println("AFTER SWAPING TWO INTEGERS:"+n1+","+n2);
}
public void swap(float n1,float n2){
float n;
n=n1;
n1=n2;
n2=n;
System.out.println("AFTER SWAPING TWO FLOAT NUMBERS:"+n1+","+n2);
}
public void swap(double n1,double n2){
double n;
n=n1;
n1=n2;
n2=n;
System.out.println("AFTER SWAPING TWO DOUBLES:"+n1+","+n2);
}
public void swap(String n1,String n2){
String n;
n=n1;
n1=n2;
n2=n;
System.out.println("AFTER SWAPING TWO INTEGERS:"+n1+","+n2);
}
}
public class Swap {
	public static void main(String[] args) {
		OverloadingSwap s1=new OverloadingSwap();
		s1.swap(5, 6);
		s1.swap(15.0f, 11.0f);
		s1.swap(73.0098, 63.45122);
		s1.swap("siri", "puji");

	}

}
