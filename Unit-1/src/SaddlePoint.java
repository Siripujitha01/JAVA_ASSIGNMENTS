import java.util.*;
class Saddle{
	int arr[][];
	int i,j,k,n,min,a,max,m;
	Scanner sc=new Scanner(System.in);
	public void matrixDimensions(){
		System.out.print("ENTER NO.OF ROWS IN MATRIX:");
		i=sc.nextInt();
		System.out.print("ENTER NO.OF COLUMNS IN MATRIX:");
		j=sc.nextInt();
		arr=new int[i][j];
	}
	public void matrixElements(){
		for(k=0;k<i;k++){
			for(n=0;n<j;n++){
				System.out.print("ENTER ELEMENTS TO MATRIX:");
				arr[k][n]=sc.nextInt();
			}
		}
		
	}
	public void saddle(){
		for (k=0;k<i;k++){
			min=arr[k][0];
			for (n=0;n<j;n++){
				if(min>arr[k][n]){
					min=arr[k][n];
					a=n;
				}
			}
			max=arr[0][a];
			for (m=0;m<i;m++){
				if(max<arr[m][a]){
					max=arr[m][a];
				}			
			}
			if (min==max){
				System.out.println("SADDLE POINT IS :"+min);
			}
		}
	}
}

public class SaddlePoint {
	public static void main(String[] args) {
		Saddle s1=new Saddle();
		s1.matrixDimensions();
		s1.matrixElements();
		s1.saddle();

	}

}
