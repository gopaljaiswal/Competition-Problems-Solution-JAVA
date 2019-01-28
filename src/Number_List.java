import java.util.Arrays;
import java.util.Scanner;
public class Number_List {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int K=in.nextInt();
			int[] A=new int[N];
			for(int j=0;j<N;j++){
				A[j]=in.nextInt();
			}
			get_no(A,K);
		}
	}

	public static void get_no(int[] A,int K){
		
		Arrays.sort(A);
		int p=0;
		for(int i=0;i<A.length;i++){
			for(int j=i;j<A.length;j++){
				if(A[j]>K){
					p++;
				}
			}
		}
		System.out.println(p);
	}
}
