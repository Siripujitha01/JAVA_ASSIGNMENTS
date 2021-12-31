import java.util.Scanner;
class ClassRoom{
String buildingname ,audiovideosystem;
int roomnumber, numberofseats, numberofpeople ;
Scanner sc=new Scanner(System.in);
public int details(){
System.out.println("ENTER BUILDING NAME:");
buildingname=sc.next();
System.out.println("ENTER IS THERE ANY FACILITY OF AUDIO VIDEO SYSTEM:");
audiovideosystem=sc.next();
System.out.println("ENTER ROOM NUMBER:");
roomnumber=sc.nextInt();
System.out.println("ENTER NO.OF SEATS IN THE CLASS:");
numberofseats=sc.nextInt();
 return numberofseats;
}
public void buildingName(){
System.out.println(buildingname);
}
public void audiovideosystem(){
System.out.println(audiovideosystem);
}
public void roomNumber(){
System.out.println(roomnumber);
}
public boolean studentsEnteringTheClass(int n1){
if(n1>numberofpeople){
return true;
}
else{
return false;
}
}
 public boolean studentsLeavingTheClass(int n2){
 if(n2>numberofpeople){
return true;
}
else{
 return false;
} 
}
}
public class TestDriver1 {
	public static void main(String[] args) {
		ClassRoom c1=new ClassRoom();
		int n,n1,n2,n3;
		n3=c1.details();
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Provide a menu as below:\n\n1) View Building name.\n2) View Room number.\n3) Audio Video System.\n4) number of students entering the class\n5) number of students leaving the class\n6)Exit\nPlease enter your choice");
		n=sc.nextInt();
		 switch(n){
		 case 1:{
		c1.buildingName();
		break;
		 }
		 case 2:{
		c1.audiovideosystem();
		 break;
		 }
		 case 3:{
		c1.roomNumber();
		break;
		 }
		 case 4:{
		System.out.print("ENTER HOW MANY STUDENTS ARE ENTERED:"); 
		n1=sc.nextInt();
		if (c1.studentsEnteringTheClass(n1)){
		System.out.println(n1);
		System.out.println("THEY ARE ONLY "+n3+"SEATS AVAILABLE");
		 }
		else {
		System.out.println(n1);
		 }
		break;
		 }
		case 5:{
		System.out.print("ENTER HOW MANY STUDENTS ARE LEAVING:");
		n2=sc.nextInt();
		if (c1.studentsLeavingTheClass(n2)){
		System.out.println(n2);
		System.out.println("THEY ARE ONLY "+n3+" PEOPLE AVAILABLE");
		 }
		else {
		 System.out.println(n2);
		 }
		 break;
		 }
		case 6:{
		System.out.println(".......EXIT........");
		 }
		default :{
		System.out.println("PLEASE ENTER A VALID CHOICE");
		 }
		 }
		}while(n!=6);
	}

}
