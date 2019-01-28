import java.util.Scanner;
public class Rahul_And_Total_Dirtiness {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		int Q=in.nextInt();
		for(int j=0;j<Q;j++){
			int O=in.nextInt();
			int L=in.nextInt();
			int R=in.nextInt();
			if(O==0){
				edit(A,L,R);
			}else if(O==1){
				sum(A,L,R);
			}
		}
	}
/////////////////////////////////////////////////////////////////////////////////////
	public static void edit(int[] A,int L,int R){
		for(int i=L-1;i<=R-1;i++){
			if(A[i]%2==0){
				A[i]=A[i]/2;
			}else{
				int q=3*(A[i]%1000000007);
				A[i]=(int)(q+1)%1000000007;
			}
		}
	}
/////////////////////////////////////////////////////////////////////////////////////
	public static void sum(int[] A,int L,int R){
		long sum=0L;
		for(int i=L-1;i<=R-1;i++){
			sum=(sum+A[i]%1000000007)%1000000007;
		}System.out.println(sum);
	}
}
