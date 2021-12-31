import java.util.Scanner;

class Tax{
	int d80c,d80cc,HRA,dmedical,gincome,tdeduction,tincome;
	int sdeduction=150000;
	double incometax;
	public void inputDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER AMOUNT TO BE DEDUCTED UNDER 80C:");
		d80c=sc.nextInt();
		System.out.print("ENTER AMOUNT TO BE DEDUCTED UNDER 80CC:");
		d80cc=sc.nextInt();
		System.out.print("ENTER AMOUNT TO BE DEDUCTED UNDER HRA:");
		HRA=sc.nextInt();
		System.out.print("ENTER AMOUNT TO BE DEDUCTED UNDER MEDICAL:");
		dmedical=sc.nextInt();
		System.out.print("ENTER GROSS INCOME:");
		gincome=sc.nextInt();
	}
	public void deductions(){
		tdeduction=sdeduction+d80c+d80cc+HRA+dmedical;
	}
	public void taxIncome(){
		tincome=gincome-tdeduction;
	}
	public void incomeTax(){
		if(tincome>0){
			System.out.println("SORRY YOU MUST PAY INCOME TAX");
			if (gincome<=500000){
				incometax=tincome*0.1;
				System.out.println("GROSS INCOME IS:"+gincome);
				System.out.println("TOTAL DEDUCTIONS IS:"+tdeduction);
				System.out.println("INCOME TAX IS:"+incometax);
				
			}
			else if(gincome<=1000000 && gincome>500000){
				incometax=25000+((gincome-500000)*0.2);
				System.out.println("GROSS INCOME IS:"+gincome);
				System.out.println("TOTAL DEDUCTIONS IS:"+tdeduction);
				System.out.println("INCOME TAX IS:"+incometax);
			}
			else if (gincome>1000000){
				incometax=75000+((gincome-1000000)*0.3);
				System.out.println("GROSS INCOME IS:"+gincome);
				System.out.println("TOTAL DEDUCTIONS IS:"+tdeduction);
				System.out.println("INCOME TAX IS:"+incometax);
			}			
			}
		else{
			System.out.println("HURRAY.....NO INCOME TAX");
			System.out.println("GROSS INCOME IS:"+gincome);
			System.out.println("TOTAL DEDUCTIONS IS:"+tdeduction);
		}
		}
}

public class IncomeTax {
	public static void main(String[] args) {
		Tax t1=new Tax();
		t1.inputDetails();
		t1.deductions();
		t1.taxIncome();
		t1.incomeTax();
	}

}
