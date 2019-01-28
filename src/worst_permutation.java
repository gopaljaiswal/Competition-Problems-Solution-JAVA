import java.util.Arrays;
import java.util.Scanner;
public class worst_permutation {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int K=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		get_per(A,K);
	}
	public static void get_per(int[] A,int K){
		int[] B=Arrays.copyOf(A,A.length);
		Arrays.sort(B);
		int t=K;
		int j=A.length-1;
		for(int i=0;i<j;i++){
			if(t==0){
				break;
			}else{
			if(A[i]!=B[j]){
				int p=B[j];
				for(int k=i;k<=j;k++){
					if(p==A[k]){
						t--;
						j--;
						int l=A[k];
						A[k]=A[i];
						A[i]=l;
						break;
					}
				}
			}else{
				j--;
			}}}
		for(int m=0;m<A.length;m++){
			System.out.print(A[m]+" ");
		}
	}
}