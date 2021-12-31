import java.util.Scanner;

class  BodyMassIndex{
	int weight,height;
	double BMI;
	public void inputDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER PERSON'S WEIGHT (IN POUNDS):");
		weight=sc.nextInt();
		System.out.println("ENTER PERSON'S HEIGHT (IN INCHES):");
		height=sc.nextInt();	
	}
	public void calculatingBMI(){
		BMI=(720*weight)/(height*height);
	}
	public void displayMessage(){
		if (BMI>=19 && BMI<=25){
			System.out.println("PERSON IS HEALTHY");
		}
		else if (BMI>25){
			System.out.println("PERSON IS ABOVE HEALTHY RANGE");
		}
		else if (BMI<19){
			System.out.println("PERSON IS BELOW HEALTHY RANGE");
		}
	}
}

public class BMI {
	public static void main(String[] args) {
		BodyMassIndex b1=new BodyMassIndex();
		b1.inputDetails();
		b1.calculatingBMI();
		b1.displayMessage();


	}

}
