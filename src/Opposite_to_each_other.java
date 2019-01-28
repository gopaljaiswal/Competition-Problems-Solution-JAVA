import java.util.Scanner;
public class Opposite_to_each_other {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
		int N=in.nextInt();
		int X=in.nextInt();
		String str=in.next();
		get_sum(N,X,str);}
	}
	public static void get_sum(int N,int X,String str){
		long sum=0;
		int p=0;
		int[] A=new int[N];
		if(str.charAt(0)=='A'){
			A[0]=X;
			sum+=A[0];
		}else{
			A[0]=-X;
		}
		for(int i=1;i<N;i++){
			if(str.charAt(i)=='A'){
				A[i]=A[i-1];
			}else if(str.charAt(i)=='B'){
				A[i]=-A[i-1];
			}
		}
		System.out.println(A[N-1]);
	}
}
