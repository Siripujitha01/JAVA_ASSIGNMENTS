import java.util.Scanner;

class Collatz{
	int n;
	public void input(){
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A NUMBER:");
		n=sc.nextInt();
	}
	public void hailstone(){
		System.out.print(n+",");
		while(n!=1){
			if (n%2==0){
				System.out.print(n/2+",");
				n=n/2;
			}
			else {
				System.out.print((3*n)+1+",");
				n=(3*n)+1;
			}
		}
	}
}

public class Syracuse {
	public static void main(String[] args) {
		Collatz c1=new Collatz();
		c1.input();
		c1.hailstone();
	}

}
