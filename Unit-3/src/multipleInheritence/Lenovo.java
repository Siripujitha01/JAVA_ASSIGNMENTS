package multipleInheritence;
import MultipleInheritenceDemo.*;
public class Lenovo {
	public static void main(String[] args) {
		Laptop lp=new Laptop("LENOVO","INTEL","WINDOWS","11thGENERETION","GREY",256,8,60000,90);
		lp.core();
		lp.operatingSystem();
		lp.version();
		lp.SSD();
		lp.RAM();
		lp.cost();
		lp.colour();
        lp.flexibility();
	}

}
