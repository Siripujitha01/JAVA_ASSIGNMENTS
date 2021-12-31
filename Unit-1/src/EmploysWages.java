import java.util.*;

class Employe{
	int hwage,totalhours,overtime;
	double overtimepay,weeklypay;
	public void inputDetails(){
	Scanner	sc=new Scanner(System.in);
	System.out.println("ENTER EMPLOYEE HOURLY WAGE:");
	hwage=sc.nextInt();
	System.out.println("ENTER TOTAL REGULAR HOURS:");
	totalhours=sc.nextInt();
	System.out.println("ENTER TOTAL OVERTIME HOURS:");
	overtime=sc.nextInt();	
	}
	public void overTimePay(){
		overtimepay=(1.5*hwage)*overtime;
	}
	public  void  weeklyPay(){
		weeklypay=7*(hwage*totalhours+overtimepay);
		System.out.println("EMPLOYEE TOTAL WEEKLY PAY IS:"+weeklypay);
	}
}

public class EmploysWages {
	public static void main(String[] args) {
		Employe s1=new Employe();
		s1.inputDetails();
		s1.overTimePay();
		s1.weeklyPay();
	}

}
