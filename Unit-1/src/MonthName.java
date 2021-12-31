import java.util.*;
import java.util.Random;
class Month{
	Random rand=new Random();
	int n=rand.nextInt(12);
	public void displayMonth(){
		if (n==1){
			System.out.println("MONTH IS JANUARY");
		}
		else if (n==2){
			System.out.println("MONTH IS FEBRUARY");
		}
		else if (n==3){
			System.out.println("MONTH IS MARCH");
		}
		else if (n==4){
			System.out.println("MONTH IS APRIL");
		}
		else if (n==5){
			System.out.println("MONTH IS MAY");
		}
		else if (n==6){
			System.out.println("MONTH IS JUNE");
		}
		else if (n==7){
			System.out.println("MONTH IS JULY");
		}
		else if (n==8){
			System.out.println("MONTH IS AUGUST");
		}
		else if (n==9){
			System.out.println("MONTH IS SEPTEMBER");
		}
		else if (n==10){
			System.out.println("MONTH IS OCTOBER");
		}
		else if (n==11){
			System.out.println("MONTH IS NOVEMBER");
		}
		else {
			System.out.println("MONTH IS DECEMBER");
		}
	}
}


public class MonthName {
	public static void main(String[] args) {
		Month m1=new Month();
		m1.displayMonth();
	}

}
