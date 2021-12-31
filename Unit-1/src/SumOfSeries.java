import java.util.Scanner;

class Sum{
	int n;
	double i,sum=0,r;
	public void input(){
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER NO.OF TERMS:");
		n=sc.nextInt();
	}
	public void sumOfSeries(){
		System.out.print("SERIES IS :");
		for (i=1;i<=(2*n);i+=2){
			r= i/(i+1);
			if(i<(2*n)-1){
			System.out.print((int)i+"/"+(int)(i+1)+"+");
			}
			else{
				System.out.print((int)i+"/"+(int)(i+1));
			}
			sum+=r;
		}
		System.out.println("\nSUM OF SERIES UPTO GIVEN TERMS:"+sum);
	}
}

public class SumOfSeries {
	public static void main(String[] args) {
		Sum s1=new Sum();
		s1.input();
		s1.sumOfSeries();
	}

}
