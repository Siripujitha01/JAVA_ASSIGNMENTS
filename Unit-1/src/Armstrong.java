import java.util.Scanner;

class ArmstrongNumber{
	int n,j=0,i,a,sum=0,a1,r,r1=1;
	public void input(){
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A NUMBER:");
		n=sc.nextInt();
		a=n;
		a1=n;
	}
	public void checking(){
		while(n>0){
			n=n/10;
			j+=1;
		}
		while(a>0){
			r=a%10;
			for (i=0;i<j;i++){
				r1*=r;
			}
			sum+=r1;
			a/=10;
			r1=1;
		}
		if (sum==a1){
			System.out.println("GIVEN NUMBER IS AN ARMSTRONG NUMBER");
		}
		else {
			System.out.println("GIVEN NUMBER IS NOT AN ARMSTRONG NUMBER");
		}
	}
}

public class Armstrong {
	public static void main(String[] args) {
		ArmstrongNumber a1=new ArmstrongNumber();
		a1.input();
		a1.checking();

	}

}
