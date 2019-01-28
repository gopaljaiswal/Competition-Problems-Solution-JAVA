import java.util.Scanner;
public class Sherloch_and_watson {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] a=new int[N];
		int K=in.nextInt();
		int t=in.nextInt();
		for(int i=0;i<N;i++){
			a[i]=in.nextInt();
		}
		int[] Q=new int[t];
		for(int i=0;i<t;i++){
			Q[i]=in.nextInt();
		}dispaly(a,K,Q);}
	
	public static void dispaly(int[] a,int K,int[] Q){
		for(int i=0;i<K;i++){
			a=arr(a);
		}
		for(int i=0;i<Q.length;i++){
			System.out.println(a[Q[i]]);
		}
		
	}
		
	
		
	public static int[] arr(int[] a){	
		int N=a.length;
		a[0]=a[N-1];
		for(int i=1;i<N;i++){
			a[i]=a[i-1];
		}	
		return a;
		}
}
	
