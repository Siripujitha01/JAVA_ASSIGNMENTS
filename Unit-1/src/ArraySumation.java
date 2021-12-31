import java.util.*;
class Arrays{
	int n,i,re,sum=0;
	Scanner sc=new Scanner(System.in);
	int arr[];
	int sum1[]={0,0,0,0,0,0,0,0,0,0};
	public void inputSize(){
		System.out.print("ENTER NO.OF ELEMENTS IN THE ARRAY:");
		n=sc.nextInt();
		arr=new int[n];
	}
	public void arrayElements(){
		for (int i=0;i< n;i+=1){
			System.out.print("ENTER ELEMENTS IN THE ARRAY:");
			arr[i]=sc.nextInt();
		}
	}
	public void summation(){
		for(i=0;i<n;i++){
			re=arr[i]%10;
			sum1[re]+=arr[i];
		}
		for (i=0;i<10;i++){
			System.out.print(sum1[i]+"  ");
		}
	}
}


public class ArraySumation {
	public static void main(String[] args) {
		Arrays a1=new Arrays();
		a1.inputSize();
		a1.arrayElements();
		a1.summation();
	}

}
