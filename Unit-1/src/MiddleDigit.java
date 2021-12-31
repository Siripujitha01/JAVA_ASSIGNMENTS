import java.util.Scanner;

class Middle{
	int a,rem,sum=0,c=0,s=0;
	public void inputNumber(){
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A THREE DIGIT NUMBER:");
		a=sc.nextInt();
	}
	public void middle(){
		while(a>0){
			rem=a%10;
			a/=10;
			c+=1;
			if (c==1 || c==3){
				s+=rem;
			}
			else {
				sum+=rem;
			}
		}
		if (sum==s){
			System.out.println("MIDDLE DIGIT IS EQUAL TO SUM OF TWO DIGITS");
		}
		else {
			System.out.println("MIDDLE DIGIT IS NOT EQUAL TO SUM OF TWO DIGITS");
		}
	}
}

public class MiddleDigit {
	public static void main(String[] args) {
		Middle m1=new Middle();
		m1.inputNumber();
		m1.middle();
	}

}
