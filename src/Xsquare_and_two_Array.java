import java.util.*;
public class Xsquare_and_two_Array {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		int[] A=new int[N];
		int[] B=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		for(int i=0;i<N;i++){
			B[i]=in.nextInt();
		}
		for(int i=0;i<N;i++){
			int p=in.nextInt();
			int L=in.nextInt();
			int R=in.nextInt();
			long sum=0;
			if(p==1){
				for(int k=L-1;k<R;k=k+2){
					sum+=A[k];
				}
				for(int k=L;k<R;k=k+2){
					sum+=B[k];
				}
			}else{
				for(int k=L-1;k<R;k=k+2){
					sum+=B[k];
				}
				for(int k=L;k<R;k=k+2){
					sum+=A[k];
				}
			}
		System.out.println(sum);
		}
	}
}
