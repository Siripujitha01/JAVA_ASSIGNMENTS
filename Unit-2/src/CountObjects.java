class ObjectsCounting{
static int count=0;
public ObjectsCounting(){
count+=1;
}
public void display(){
System.out.println("NO.OF OBJECTS CREATED IS:"+count);
}
}


public class CountObjects {
	public static void main(String[] args) {
			ObjectsCounting b1=new ObjectsCounting();
			ObjectsCounting b2=new ObjectsCounting();
			ObjectsCounting b3=new ObjectsCounting();
			ObjectsCounting b4=new ObjectsCounting();
			ObjectsCounting b5=new ObjectsCounting();
			ObjectsCounting b6=new ObjectsCounting();
			ObjectsCounting b7=new ObjectsCounting();
			ObjectsCounting b8=new ObjectsCounting();
			ObjectsCounting b9=new ObjectsCounting();
			b1.display();
	}

}
