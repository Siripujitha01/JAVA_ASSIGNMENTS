import java.util.*;
class Game{
	int n,s;
	public void game(){
	while(s!=-1){
	Random rand=new Random();
	n=rand.nextInt(2);
	Scanner sc=new Scanner(System.in);
	System.out.print("ENTER 0,1 OR 2 OR -1 TO QUIT :");
	s=sc.nextInt();
	if (s==n){
		System.out.println("OOPS IT'S A DRAW");
	}
	else if ((s==0 && n==2) || (s==1 && n==0) || (s==2 && n==1)){
		System.out.println("CONGRAT'S YOU WON OVERR THE COMPUTER");
	}
	else if ((s==2 && n==0) || (s==0 && n==1) || (s==1 && n==2)){
		System.out.println("SORRY YOU LOST AND COMPUTER WON THE GAME ");
	}	
	else{
		System.out.println("THANKS TO PLAY THE GAME");
	}
	}
	}
}

public class RockPaperScissors {
	public static void main(String[] args) {
		Game g1=new Game();
        g1.game();
	}

}
