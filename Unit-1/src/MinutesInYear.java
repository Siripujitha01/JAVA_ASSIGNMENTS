import java.util.*;

class  Minutes{
	int min,year;
	int days=365;
	public void year(){
		System.out.print("ENTER YEAR:");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
	}
	public void leapYearOrNot(){
		if (year%400==0){
			days+=1;	
		}
		else if(year%100==0){
			days=365;
		}
		else if (year%4==0){
			days+=1;
		}
	}
	public void minutes(){
		min=days*24*60;
		System.out.println("NO.OF MINUTES IN GIVEN YEAR IS:"+min);
	}
	
}

public class MinutesInYear {
	public static void main(String[] args) {
		Minutes m1=new Minutes();
		m1.year();
		m1.leapYearOrNot();
		m1.minutes();
	}

}
