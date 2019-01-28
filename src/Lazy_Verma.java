import java.util.Scanner;
public class Lazy_Verma {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		int[]A=new int[N];
		int[] B=new int[M];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		for(int i=0;i<N;i++){
			B[i]=in.nextInt();
		}
		long sum=0;
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				sum+=A[i]*B[j];
			}
		}
	System.out.println(sum);	
	}
}
