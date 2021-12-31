import Points.*;
import java.util.*;
public class Inheritance {
	public static void main(String[] args) {
		int i;
		float n;
		float[] arr=new float[3];
		Point3D p3=new Point3D(3.5f,6.5f,0.0f);
		do
		{
			System.out.println("SELECT ONE OPTION:1.GET X 2.SET X 3.SET Y 4.GET Y 5.SET Z  6.GET Z  7.SET XY  8.GET XY  9.SET XYZ   10.GET XYZ  11.XY TOSTRING"+"   12.XYZ TOSTRING   13.EXIT");
			Scanner sc=new Scanner(System.in);
			i=sc.nextInt();
			switch (i)
			{
			case 1:
				System.out.println("X VALUE IS:"+p3.getX());
				break;
			case 2:
				System.out.println("enter a value:");
			    n=sc.nextFloat();
				p3.setX(n);
				break;
			case 3:	
				System.out.println("enter a value:");
				n=sc.nextFloat();
				p3.setY(n);
				break;
			case 4:
				System.out.println("Y VALUE IS:"+p3.getY());
				break;
			case 5:
				System.out.println("enter a value:");
				n=sc.nextFloat();
				p3.setZ(n);
				break;
			case 6:
				System.out.println("Z VALUE IS:"+p3.getZ());
				break;
			case 7:
				p3.setXY();
				break;
			case 8:
				arr=p3.getXY();
				System.out.println("X,Y VALUE IS:"+"{"+arr[0]+","+arr[1]+"}");
				break;
			case 9:
				p3.setXYZ();
				break;
			case 10:
				arr=p3.getXYZ();
				System.out.println("X,Y,Z VALUE IS:"+"{"+arr[0]+","+arr[1]+","+arr[2]+"}");
				break;
			case 11:
				System.out.println(p3.toString());
				break;
			case 12:
				System.out.println(p3.toStrings());
				break;
			case 13:
				System.out.println("...........EXIT..........");
				break;
			default:
				System.out.println("PLEASE ENTER A VALID OPTION");
			}
		}while(i!=13);

	}


}
