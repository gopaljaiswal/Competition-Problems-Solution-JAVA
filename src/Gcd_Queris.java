import java.util.Scanner;
public class Gcd_Queris {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int Q=in.nextInt();
			int[] A=new int[N];
			for(int j=0;j<N;j++){
				A[j]=in.nextInt();
			}int[] L=new int[Q];
			int[] R=new int[Q];
			for(int k=0;k<Q;k++){
				L[k]=in.nextInt();
				R[k]=in.nextInt();}
			for(int l=0;l<Q;l++){
				get_result(A,L[l],R[l]);
			}
		}
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void get_result(int[] A,int L,int R){
		int b=0;
		int[] B=new int[A.length];
		for(int i=0;i<L-1;i++){
			B[b++]=A[i];
		}
		for(int j=R;j<A.length;j++){
			B[b++]=A[j];
		}
		//for(int k=0;k<b;k++){
			//System.out.print(B[k]+" ");
		//}
		find_gcd(B,b);
		//System.out.println();
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void find_gcd(int[] A,int b){
		if(b==1){
			System.out.println(A[b-1]);
		}else{
			int c=0;
			for(int i=1;i<b;i++){
				if(A[i]!=0){
				c=get_gcd(A[i-1],A[i]);}
			}
			 System.out.println(c);}
			}
			public static int get_gcd(int num1,int num2){
				if(num2==0){
				return num1;
			}
			return get_gcd(num2,num1%num2);
		}
}
