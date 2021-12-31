package MultipleInheritenceDemo;
import multipleInheritence.*;
public class Laptop implements Core_Os,Memory_Outline{

	 String core,os,version,colour,name;
	 int ssd,ram,cost,flexibility;
	 public Laptop( String nam,String c,String Os,String ver,String col,int sd,int rm,int ct,int flex)
	 {
		 name=nam;
		 core=c;
		 os=Os;
		 version=ver;
		 colour=col;
		 ssd=sd;
		 ram=rm;
		 cost=ct;
		 flexibility=flex;
	 }
	 
	 public void core()
	 {
		 System.out.println("MY LAPTOP BRAND IS                  :"+name);
		 System.out.println("CORE OF MY LAPTOP IS                :"+core);
	 }
   public void operatingSystem()
   {
  	 System.out.println("OPERATING SYSTEM OF MY LAPTOP IS    :"+os);
   }
   public void version()
   {
  	 System.out.println("CURRENT VERSION IN MY LAPTOP IS     :"+version);
   }
	 public void SSD()
	 {
		 System.out.println("STORAGE CAPACITY IN MY LAPTOP IS    :"+ssd+"GB");
	 }
   public void RAM()
   {
  	  System.out.println("PROCESSOR SPEED OF MY LAPTOP IS     :"+ram+"GB RAM");
   }
   public void flexibility()
   {
  	 System.out.println("FLEXIBILITY                         :"+flexibility+"degres");
   }
   public void cost()
   {
  	 System.out.println("PRICE OF MY LAPTOP IS               :"+cost);
   }
   public void colour()
   {
  	 System.out.println("COLOUR OF MY LAPTOP IS              :"+colour);
   }

}
