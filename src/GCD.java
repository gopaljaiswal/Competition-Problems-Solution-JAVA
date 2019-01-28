import java.util.Scanner;
public class GCD {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int m=0;m<T;m++){
		int N=in.nextInt();
		int Q=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		int[] L=new int[Q];
		int[] R=new int[Q];
		for(int j=0;j<Q;j++){
		L[j]=in.nextInt();
		R[j]=in.nextInt();}
		know_gcd(A,L,R);
		}}
	
	public static void know_gcd(int[] A,int[] L,int[] R){
		int b=0;
		for(int n=0;n<L.length;n++){
		for(int i=0;i<L[n]-1;i++){
			A[b++]=A[i];
		}
		for(int j=R[n];j<A.length;j++){
			A[b++]=A[j];
		}
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
			b++;
		}
		System.out.println();
	    find_gcd(A,b);
		}}
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////	
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
