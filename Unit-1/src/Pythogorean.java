class PythogoreanTriplets{
	int s1=0,i,j,k,s2=0,n,s3=0,n1;
	int arr[]=new int[36];
	public void triplets(){
		for (i=1;i<100;i++){
			n=i;
			for(j=1;j<100;j++){
				for(k=1;k<100;k++){
					if((i*i)==((j*j)+(k*k))){
						n1=i;
						for (s1=1;s1<100;s1++){
							if (i%s1==0&&j%s1==0&&k%s1==0){
								s2+=1;
							}
						}
						if(n==n1){
							s3+=1;							
						}
						if (s2==1&&(s3==1 || s3==3)){
							System.out.print("("+j+","+k+","+i+")"+"    ");
						}
						s2=0;
					}
				}			
			}
			s3=0;
		}
	}
}
public class Pythogorean {
	public static void main(String[] args) {
		PythogoreanTriplets p1=new PythogoreanTriplets();
		p1.triplets();
	}

}
