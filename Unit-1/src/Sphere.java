import java.util.*;


class Sphere1 {
	float radius,diameter;
	double circumference,area,volume;
	private Scanner sc;
	public void radius(){
	System.out.println("ENTER RADIUS OF THE SPHERE:");
	sc = new Scanner(System.in);
	radius=sc.nextFloat();
	}
    public void diameter(){
    	diameter=radius*2;
    	System.out.println("DIAMETER OF THE SPHERE IS:"+diameter);
    }
    public void circumference(){
    	circumference=radius*2*3.14;
    	System.out.println("circumference OF THE SPHERE IS:"+circumference);
    }
    public void surfaceArea(){
    	area=radius*radius*4*3.14;
    	System.out.println("surfaceArea OF THE SPHERE IS:"+area);
    }
    public void volume(){
    	volume=(radius*radius*radius*3.14*4)/3;
    	System.out.println("volume OF THE SPHERE IS:"+volume);
    }
}

public class Sphere {
	public static void main(String[] args) {
		Sphere1 s1=new Sphere1();
		s1.radius();
		s1.diameter();
		s1.circumference();
		s1.surfaceArea();
		s1.volume();
	}

}
