import java.util.Scanner;
public class Sherlock_Queries {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		int[] A=new int[N];
		int[] B=new int[M];
		int[] C=new int[M];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		for(int i=0;i<M;i++){
			B[i]=in.nextInt();
		}
		for(int i=0;i<M;i++){
			C[i]=in.nextInt();
		}
		for(int i=0;i<M;i++){
			for(int j=1;j<=N;j++){
				if(j%B[i]==0){
					A[j-1]=A[j-1]*C[i];
				}
			}
		}
		for(int i=0;i<N;i++){
			System.out.print(1000000000%1000000007);
		}
	}

}
