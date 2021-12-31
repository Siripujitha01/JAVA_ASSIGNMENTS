package PackageDemo;
import java.util.Scanner;

import realJava.decision.*;
import realJava.loops.*;

public class Packages {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER NO.OF TERMS TO SUM:");
		SumN sn=new SumN(sc.nextInt());
		System.out.print("ENTER A NUMBER TO GET FACTORIAL:");
		FactN fn=new FactN(sc.nextInt());
		System.out.print("ENTER TWO NUMBERS:");
		Max2 m2=new Max2(sc.nextInt(),sc.nextInt());
		System.out.print("ENTER THREE NUMBERS:");
		Max3 m3=new Max3(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("SUM OF GIVEN TERMS:"+sn.sumn());
		System.out.println("FACTORIAL OF GIVEN NUMBER:"+fn.factn());
		System.out.println("GREATEST AMONG TWO NUMBERRS:"+m2.max2());
		System.out.println("GREATEST AMONG THREE NUMBERS:"+m3.max3());
	}


}
