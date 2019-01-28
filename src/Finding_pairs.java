import java.util.Scanner;
public class Finding_pairs {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int[] A=new int[N];
			for(int j=0;j<N;j++){
				A[j]=in.nextInt();
			}
			get_pairs(A);
		}
	}
	public static void get_pairs(int[] A){
		int count=A.length;
		for(int i=0;i<A.length;i++){
			int p=A[i];
			for(int j=i+1;j<A.length;j++){
				if(p==A[j]){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
