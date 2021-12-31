import java.util.Scanner;

class Even{
	int age,i;
	public void inputAge(){
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER YOUR AGE:");
		age=sc.nextInt();
	}
	public void printingNumbers(){
		if (age%2==0){
			System.out.println("EVEN NUMBERS UPTO YOUR AGE:");
			for (i=2;i<=age;i+=2){
				System.out.print(" "+i);
			}
		}
		else {
			System.out.println("ODD NUMBERS UPTO YOUR AGE:");
			for (i=1;i<=age;i+=2){
				System.out.print(" "+i);
			}
		}
	}
}

public class EvenNumbers {
	public static void main(String[] args) {
		Even e1=new Even();
		e1.inputAge();
		e1.printingNumbers();
	}

}
