import java.util.Scanner;
public class Bday_gift {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		float[] a=new float[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextFloat();
		}
		float sum=0;
		for(int i=0;i<n;i++){
			sum=sum+a[i];
		}
		System.out.println(sum/2);
	}

}
