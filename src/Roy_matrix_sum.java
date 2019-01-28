import java.util.Scanner;
public class Roy_matrix_sum {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			get_sum(N);
		}
	}
	public static void get_sum(int N){
		long sum=0;
		int[] A=new int[N];
		int[] B=new int[N];
		for(int j=0;j<N;j++){
			A[j]=j;
			B[j]=j;
			sum+=2*j;
		}
		for(int i=1;i<N;i++){
			int t=A[i];
			for(int j=1;j<N;j++){
				sum+=Math.abs(t-B[j]);
			}
		}
		System.out.println(sum);
	}

}
