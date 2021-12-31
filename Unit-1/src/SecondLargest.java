import java.util.*;
class Second{
	int i,n,max1,a,m,a1;
	int arr[];
	Scanner sc=new Scanner(System.in);
	public void inputSize(){
		System.out.print("ENTER HOW MANY ELEMENTS IN LIST:");
		n=sc.nextInt();
		arr=new int[n];	
	}
	public void listElements(){
		for(i=0;i<n;i++){
		System.out.print("ENTER ELEMENTS:");
		arr[i]=sc.nextInt();
		}
		}
	public void secondLarge(){
		max1=arr[0];
		for(i=0;i<n;i++){
			if(max1<arr[i]){
				max1=arr[i];
				a=i;
			}
		}
		arr[a]=0;
		m=arr[0];
		for(i=0;i<n;i++){
			if(m<arr[i]){
				m=arr[i];
				a1=i;
			}
		}
		arr[a]=max1;
		System.out.println("SECOND LARGEST ELEMENT IS:"+m+"  AND INDEX IS:"+a1);
	}
}


public class SecondLargest {
	public static void main(String[] args) {
		Second s1=new Second();
		s1.inputSize();
		s1.listElements();
		s1.secondLarge();
	}

}
