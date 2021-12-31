class Person{
String firstname,lastname,surname;
public Person(){
firstname="";
lastname="";
surname="";
}
public Person(String first){
firstname=first;
}
public Person(String first,String last){
firstname=first;
lastname=last;
}
public Person(String first,String last,String sur){
firstname=first;
lastname=last;
surname=sur;
}
public void displayPerson(){
System.out.println("FIRST NAME:"+firstname);
System.out.println("LAST NAME:"+lastname);
System.out.println("SUR NAME:"+surname);
}
}
public class PersonDemo {
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person("siri");
		Person p3=new Person("siri","pujitha");
		Person p4=new Person("siri","pujitha","danaboyina");
		p2.displayPerson();
		p3.displayPerson();
		p4.displayPerson();
	}

}
