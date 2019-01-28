//Area of a polygon with given n ordered vertices
package Geeks_For_Geeks;
import java.util.Scanner;
public class Shoalace_formulae {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] X=new int[N];
		int[] Y=new int[N];
		for(int i=0;i<N;i++){
			X[i]=in.nextInt();
		}
		for(int i=0;i<N;i++){
			Y[i]=in.nextInt();
		}
		int j = N - 1;
		long area=0L;
	    for (int i = 0; i < N; i++)
	    {
	        area += (X[j] + X[i]) * (Y[j] - Y[i]);
	        j = i;  
	    }
	    System.out.print(Math.abs(area/2));
		in.close();
	}
}