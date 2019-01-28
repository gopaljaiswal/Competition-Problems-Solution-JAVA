import java.util.Scanner;
public class Fibbonic_Finding {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			long A=in.nextInt();
			long B=in.nextInt();
			int N=in.nextInt();
			get_fibbonic(A,B,N);
		}
	}
	public static void get_fibbonic(long A,long B,int N){
		long S = 0;
		if(N==0){
			S=A;
		}else if(N==1){
			S=B;
		}else{
		for(int i=2;i<=N;i++){
			S=A+B;
			A=B;
			B=S%1000000007;
		}}
		System.out.println(S);
	}
}
