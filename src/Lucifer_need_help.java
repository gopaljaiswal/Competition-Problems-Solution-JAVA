import java.util.Scanner;
public class Lucifer_need_help {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		int M=in.nextInt();
		for(int i=0;i<M;i++){
			int I=in.nextInt();
			I=I-1;
			int J=in.nextInt();
			J=J-1;
			int K=in.nextInt();
			for(int j=I;j<=J;j++){
				A[j]=A[j]+K;
			}
		}
	for(int j=0;j<N;j++){
		System.out.println(A[j]);
	}	
	}

}
