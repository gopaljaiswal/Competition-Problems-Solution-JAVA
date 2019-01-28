import java.util.Arrays;
import java.util.Scanner;
public class Almost_sorted {
	public static int p=0;
	public static void main(String[] args){
		@SuppressWarnings({ "resource" })
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		int[] B=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}B=A;
		Arrays.sort(B);
		for(int i=0;i<N;i++){
			if(A[i]==B[i]){
				p++;
			}
		}
		for(int i=0;i<N;i++){
			System.out.print(A[i]+" ");
		}
		System.out.print(p);
	}
}
