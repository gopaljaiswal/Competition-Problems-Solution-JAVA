import java.util.Arrays;
import java.util.Scanner;
public class Angry_children {
	public static void main(String[] args){
		@SuppressWarnings({ "resource" })
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int K=in.nextInt();
		int[] A=new int[N];
		int[] B=new int[N-1];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		int t=0;
		Arrays.sort(A);
		for(int i=1;i<N;i++){
			B[i-1]=A[i]-A[i-1];
		}
		for(int i=0;i<N-1;i++){
			int l=0;
			int p=B[i];
	        for(int j=i;j<N-1;j++){
	        	if(p==B[j]){
	        		l++;
	        	}}
			if(l==K-1){
				t=p;
				break;
			}
		}
		System.out.print(t);
	}
}