import java.util.Scanner;

class SpeedFine{
	int spdlmt,clkspd,a,fine;
	public void inputSpeed(){
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER SPEED LIMIT:");
		spdlmt=sc.nextInt();
		System.out.print("ENTER CLOCK SPEED OF VEHICLE:");
		clkspd=sc.nextInt();
	}
	public void message(){
		if (clkspd<=spdlmt){
			System.out.println("SPEED IS LEGAL");
		}
		else{
			System.out.println("SPEED IS ILLEGAL");
			a=fine();
			System.out.println("AND AMOUNT OF FINE IS:"+a);
		}
	}
	public int fine(){	
		return (2000+50*(clkspd-spdlmt));
	}
}


public class Speed {
	public static void main(String[] args) {
		SpeedFine s1=new SpeedFine();
		s1.inputSpeed();
		s1.message();
	}

}
