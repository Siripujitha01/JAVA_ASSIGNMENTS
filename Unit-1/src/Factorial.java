import java.util.Scanner;

class Fact{
	int i,n=1,s=0;
	public char is_fact(int a,int b){
		for (i=1;n<=b;i++){
			n*=i;
			if (i==a){
				s=1;
			}
			if (n==b){
				break;
			}
			
		}
		if (s==1){
			return 'T';
		}
		else {
			return  'F';
		}
		
	}
}

public class Factorial {
	public static void main(String[] args) {
		int a,b;
		char s;
	  System.out.println("ENTER A NUMBER:");	
	  Scanner sc=new Scanner(System.in);
	  a=sc.nextInt();
	  System.out.println("ENTER ANOTHER NUMBER:");	
	  Scanner sc1=new Scanner(System.in);
	  b=sc1.nextInt();
      Fact f1=new Fact();
      s=f1.is_fact(a,b);
      if (s=='T'){
    	  System.out.println("FIRST ARGUMENT IS A FACTOR OF SECOND");
      }
      else{
    	  System.out.println("FIRST ARGUMENT IS NOT A FACTOR OF SECOND");
      }
	}

}
