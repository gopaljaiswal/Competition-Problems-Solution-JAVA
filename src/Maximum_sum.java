import java.util.Scanner;
public class Maximum_sum {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			long M=in.nextLong();
			long[] A=new long[N];
			for(int j=0;j<N;j++){
				A[j]=in.nextLong();
			}
			get_sum(A,M);
			in.close();
		}
	}
	public static void get_sum(long[] A,long M){
		long sum=0L,l=0L;
		for(int i=0;i<A.length;i++){
			for(int j=i;j<A.length;j++){
				l+=A[j];
				if(l%M>sum){
					sum=l;
				}
			}
			l=0;}
			System.out.println(sum);
	}
		
}
