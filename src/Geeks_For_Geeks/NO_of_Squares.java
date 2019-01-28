//Count number of squares in a rectangle
package Geeks_For_Geeks;
import java.util.Scanner;
public class NO_of_Squares {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int M=in.nextInt();
		int N=in.nextInt();
		if(M<=N){
			int q=M;
			M=N;
			N=q;
		}
		int l=(int)(M*(M+1)*(2*M+1)/6)+(N-M)*(M*(M+1)/2);
		System.out.println(l);
	}
}
