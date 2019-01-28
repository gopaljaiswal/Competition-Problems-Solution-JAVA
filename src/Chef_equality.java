import java.util.Arrays;
import java.util.Scanner;
public class Chef_equality {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int[] A=new int[N];
			for(int j=0;j<N;j++){
				A[j]=in.nextInt();
			}
			Arrays.sort(A);
			check_equality(A);
		}
	}
	public static void check_equality(int[] A){
		int l=A.length;
		for(int i=0;i<A.length;i++){
			
			}
	}
}
