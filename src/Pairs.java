import java.util.Scanner;
public class Pairs {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		long p=0L;
		long K=in.nextLong();
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		for(int i=0;i<N;i++){
			int t=A[i];
			for(int j=0;j<N;j++){
				if(A[j]-t==K){
					p++;
				}
			}
		}
		System.out.println(p);
	}

}
