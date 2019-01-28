import java.util.Scanner;
public class Chef_and_Stone {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			long K=in.nextLong();
			long[] A=new long[N];
			long[] B=new long[N];
			for(int j=0;j<N;j++){
				A[j]=in.nextLong();
			}
			for(int j=0;j<N;j++){
				B[j]=in.nextLong();
			}
			display_max(K,A,B);
		}
	}
	
	public static void display_max(long K,long[] A,long[] B){
		for(int i=0;i<A.length;i++){
			A[i]=B[i]*((int)K/A[i]);
		}
		long c=max_value(A);
		System.out.println(c);
	}

	
	public static long max_value(long[] A){
		long p=A[0];
		for(int i=1;i<A.length;i++){
			if(A[i]>p){
				p=A[i];
			}
		}
		return p;
	}
}
