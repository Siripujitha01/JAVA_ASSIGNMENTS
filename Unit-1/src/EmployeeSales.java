import java.util.Scanner;

class Sales{
	int arr[][]=new int[3][6];
	int i,j;
	int sum1[]={0,0,0},s=0;
	public void input(){
		Scanner sc=new Scanner(System.in);
		for(i=0;i<3;i++){
			for (j=0;j<6;j++){
				System.out.println("ENTER SALES FIGURES OF "+(i+1)+"  SALES MANAGER PER MONTH:");
				arr[i][j]=sc.nextInt();
			}
			
		}
	}
	public void claculateTotal(){
		for(i=0;i<3;i++){
			for(j=0;j<6;j++){
				s+=arr[i][j];
			}
			sum1[i]=s;
			s=0;
		}
		for(i=0;i<3;i++){
			s+=sum1[i];
		}
		
	}
	public void displayTotal(){
		for(i=0;i<3;i++){
				System.out.println("SALES TOTAL OF  "+(i+1)+" SALES PERSON IS: "+sum1[i]);
		}
		System.out.println("GRAND TOTAL OF SALES FOR SIX MONTHS IS:"+s);
	}
}


public class EmployeeSales {
	public static void main(String[] args) {
		Sales s1=new Sales();
		s1.input();
		s1.claculateTotal();
		s1.displayTotal();
	}

}
