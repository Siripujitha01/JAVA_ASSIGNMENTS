import java.util.Scanner;

class DoOperations{
	int c;
	public void operation(char a,int n1,int n2){
		if (a=='+'){
			c=n1+n2;
			System.out.println("ADDITION OF GIVEN TWO NUMBERS IS:"+c);
		}
		else if (a=='-'){
			c=n1-n2;
			System.out.println("SUBTRACTION OF GIVEN TWO NUMBERS IS:"+c);
		}
		else if (a=='*'){
			c=n1*n2;
			System.out.println("MULTIPLICATION OF GIVEN TWO NUMBERS IS:"+c);
		}
		else if (a=='/'){
			c=n1/n2;
			System.out.println("DIVISION OF GIVEN TWO NUMBERS IS:"+c);
		}
	}
}


public class Operations {
	public static void main(String[] args) {
		int n1,n2;
		char a;
		System.out.print("ENTER A NUMBER:");	
		  Scanner sc=new Scanner(System.in);
		  n1=sc.nextInt();
		  System.out.print("ENTER ANOTHER NUMBER:");	
		  n2=sc.nextInt();
		  System.out.print("ENTER AN OPERATOR:");	
		  a=sc.next().charAt(0);
		DoOperations d1=new DoOperations();
		d1.operation(a, n1, n2);
	}

}
