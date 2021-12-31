import java.util.*;

class ScoreCard{
     int pointsEarnedPlayer1,pointsEarnedPlayer2,n;
     String st=new String();
     String teamName,player1,player2,p1,p2;
     Scanner sc=new Scanner(System.in);
     public ScoreCard(){
         pointsEarnedPlayer1=0;
         pointsEarnedPlayer2=0;
}
     public ScoreCard(String tN,String p1N,String p2N){
         teamName=tN;
         player1=p1N;
         player2=p2N;
}
public void scorePoints(String p1,int c1){
if(p1.equals(player1)){
pointsEarnedPlayer1+=c1;
}
else if (p1.equals(player2)){
pointsEarnedPlayer2+=c1;
}
}
public int getPoints( String p2){
if(p2.equals(player1)){
return pointsEarnedPlayer1;
}
else if(p2.equals(player2)) {
return pointsEarnedPlayer2;
}
return 0;
}
public int getTotalPoints(){
return pointsEarnedPlayer1+pointsEarnedPlayer2;
}
public void printSummary(){
System.out.println("TEAM NAME IS:"+teamName);
 n=getTotalPoints();
 System.out.println("TEAM SCORE IS:"+n);
}
}

public class TestDriver {
	public static void main(String[] args) {
		String teamName,player1Name,player2Name;
		int n,n1,n2;
		Scanner sc=new Scanner(System.in);
		ScoreCard s1=new ScoreCard();
		System.out.println("PLEASE ENTER THE TEAM NAME: ");
		teamName=sc.next();
		System.out.println("ENTER PLAYER1 NAME:");
		player1Name=sc.next();
		System.out.println("ENTER PLAYER2 NAME:");
		player2Name=sc.next();
		ScoreCard s2=new ScoreCard(teamName,player1Name,player2Name);
		do{
		System.out.println("ENTER YOUR CHOICE:");
		System.out.println("1. scorePoints \n2. getPoints\n3. getTotalPoints\n4. printSummary\n5. Exit");
		n=sc.nextInt();
		switch(n){
		case 1:{
		System.out.print("ENTER PLAYER NAME:");
		String p1=sc.next();
		System.out.print("ENTER PLAYER SCORE");
		int p1Score=sc.nextInt();
		s2.scorePoints(p1,p1Score);
		break;
		}
		case 2:{
		System.out.print("ENTER PLAYER NAME:");
		String p2=sc.next();
		n1=s2.getPoints(p2);
		System.out.println("PLAYER SCORE:"+n1);
		break;
		}
		case 3:{
		n2=s2.getTotalPoints();
		System.out.println("TOTAL SCORE IS:"+n2);
		break;
		}
		case 4:{
		s2.printSummary();
		break;
		}
		case 5:{
		System.out.println(".........EXIT.........");
		break;
		}
		default :{
		System.out.println("PLEASE ENTER A VALID CHOICE");
		}
		}
		}while(n!=5);
	}

}
