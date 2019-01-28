import java.util.Scanner;
public class Check_GCD {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int K=in.nextInt();
			int[] A=new int[N];
			for(int j=0;j<N;j++){
				A[j]=in.nextInt();
				check_GCD(A,K);
			}
		}
	}
	public static void check_GCD(int[] A,int K){
		for(int i=0;i<A.length;i++){
			for(int j=i;j<A.length;j++){
				System.out.print(A[j]+" ");
			}
			System.out.println();
		}
	}
}
